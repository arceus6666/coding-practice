// New Year and Hurry - CodeForces
// Status: Accepted

using System;

namespace App {
  class App {

    static Func<int[]> invr =
      () => Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
    static int Main(string[] args) {
      int[] input = invr();
      int n = input[0],
        k = 240 - input[1];

      int t = 0,
        p = 0;

      for (int i = 1; i <= n; i++) {
        t += i * 5;
        if (k - t < 0) {
          break;
        }
        p++;
      }

      Console.WriteLine(p);

      return 0;
    }
  }
}
