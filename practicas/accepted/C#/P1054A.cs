// Elevator or Stairs? - CodeForces
// Status: Accepted

using System;

namespace ConsoleApp {
  class Program {
    static Func<int[]> invr =
      () => Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

    static int Main(string[] args) {
      int[] input = invr();
      int x = input[0],
        y = input[1],
        z = input[2],
        t1 = input[3],
        t2 = input[4],
        t3 = input[5];

      int d = Math.Abs(x - y), dz = Math.Abs(x - z);
      int st = d * t1, et = (t2 * dz) + (d * t2) + (3 * t3);

      Console.WriteLine(!(et > st) ? "YES" : "NO");

      return 0;
    }
  }
}
