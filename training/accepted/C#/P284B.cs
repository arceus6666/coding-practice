// Cows and Poker Game - CodeForces
// Status: Accepted

using System;

class Program {

  static Func<int> inp =
    () => int.Parse(Console.ReadLine());

  static Func<string> insr =
    () => Console.ReadLine();

  static int toPos(char c) {
    if (c == 'A') {
      return 0;
    } else if (c == 'I') {
      return 1;
    } else {
      return 2;
    }
  }

  static int Main(string[] args) {
    int n = inp();
    char[] s = insr().ToCharArray();
    int[] sv = new int[3];
    // [A,I,F]
    foreach (char c in s) {
      sv[toPos(c)]++;
    }

    int show = sv[1] > 1 ? 0 : (sv[1] == 1 ? 1 : sv[0]);

    // Array.ForEach(sv, (int x) => Console.Write(x + " "));
    // Console.WriteLine();
    Console.WriteLine(show);

    return 0;
  }
}
