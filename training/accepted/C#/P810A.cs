// Straight «A» - CodeForces
// Status: Accepted

using System;

namespace ConsoleApp {
  class Program {

    static Func<int[]> invr =
      () => Array.ConvertAll(Console.ReadLine().Split(' '),
        int.Parse);

    static bool val(int a, int k, int n1, int n2) {
      return ((a + (k * n2)) / ((n1 + n2) * (k - 0.5f))) < 1;
    }

    static int Main(string[] args) {
      int[] input = invr();
      int n = input[0], k = input[1];
      int[] a = invr();
      int aa = 0;

      foreach (int nn in a) {
        aa += nn;
      }

      float x = ((k - aa) / 0.5f) - n;
      int i = 0;
      while (val(aa, k, n, i))i++;
      Console.WriteLine(i);
      return 0;
    }
  }
}
