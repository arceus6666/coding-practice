// Merge it! - CodeForces
// Status: Accepted

using System;

class Program {

  static Func<int[]> invr =
    () => Array.ConvertAll(Console.ReadLine().Split(' '),
      int.Parse);

  static int Main(string[] args) {
    int t = invr() [0];
    while (t-- > 0) {
      int n = invr() [0];
      int[] a = invr();
      Array.Sort(a);
      int[] mod = new int[3];
      foreach (int e in a) {
        mod[e % 3]++;
      }
      int s = mod[0];
      // s += 1;
      int min = mod[1] < mod[2] ? mod[1] : mod[2];
      mod[1] -= min;
      mod[2] -= min;
      s += min;
      s += (mod[1] + mod[2]) / 3;

      Console.WriteLine(s);
    }
    return 0;
  }
}
