// Bank Robbery - CodeForces
// Status: Accepted

using System;

namespace ConsoleApp {
  class Program {

    static Func<int> inp =
      () => int.Parse(Console.ReadLine());

    static Func<int[]> invr =
      () => Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
    static int Main(string[] args) {
      int[] input = invr();
      int a = input[0], b = input[1], c = input[2];
      int n = inp();
      int[] x = invr();
      int bn = 0;
      for (int i = 0; i < n; i++) {
        if (b < x[i] & x[i] < c) {
          // Console.WriteLine(i + " " + x[i]);
          bn++;
        }
      }

      Console.WriteLine(bn);

      return 0;
    }
  }
}
