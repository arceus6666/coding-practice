// IQ Test - CodeForces
// Status: Accepted

using System;

class Program {

  static Func<string> insr =
    () => Console.ReadLine();

  static void printM(char[, ] m) {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        Console.Write(m[i, j]);
      }
      Console.WriteLine();
    }
  }

  static int convert(char c) {
    return c == '#' ? 0 : 1;
  }
  static int Main(string[] args) {
    char[, ] t = new char[4, 4];
    for (int i = 0; i < 4; i++) {
      char[] l = insr().ToCharArray();
      for (int j = 0; j < 4; j++) {
        t[i, j] = l[j];
      }
    }
    // printM(t);
    for (int i = 1; i < 3; i++) {
      for (int j = 1; j < 3; j++) {
        // Console.Write(t[i, j]);
        int[] s = {
          convert(t[i - 1, j - 1]) + convert(t[i - 1, j]) + convert(t[i, j - 1]) + convert(t[i, j]),
          convert(t[i - 1, j]) + convert(t[i - 1, j + 1]) + convert(t[i, j + 1]) + convert(t[i, j]),
          convert(t[i, j - 1]) + convert(t[i + 1, j - 1]) + convert(t[i + 1, j]) + convert(t[i, j]),
          convert(t[i, j + 1]) + convert(t[i + 1, j + 1]) + convert(t[i + 1, j]) + convert(t[i, j]),
        };
        foreach (int e in s) {
          if (e < 2 || e > 2) {
            Console.WriteLine("YES");
            return 0;
          }
        }

      }
    }
    Console.WriteLine("NO");
    return 0;
  }
}
