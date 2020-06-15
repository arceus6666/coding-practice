// Towers - CodeForces
// Status: Accepted

using System;

class Program {

  static Func<int> inp =
    () => int.Parse(Console.ReadLine());

  static Func<int[]> invr =
    () => Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

  static int max(int[] arr) {
    int m = 0;
    foreach (int n in arr) {
      m = n > m ? n : m;
    }
    return m;
  }

  static int fullSize(int[] arr) {
    int s = 0;
    foreach (int i in arr) {
      if (i > 0) s++;
    }
    return s;
  }

  static int Main(string[] args) {
    int n = inp();
    int[] l = invr();
    int[] s = new int[max(l) + 1];
    foreach (int i in l) {
      s[i]++;
    }
    Console.WriteLine(max(s) + " " + fullSize(s));
    return 0;
  }
}
