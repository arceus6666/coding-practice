// Big Segment - CodeForces
// Status: Accepted

using System;
using System.Collections.Generic;

class Program {

  static Func<int[]> invr =
    () => Array.ConvertAll(Console.ReadLine().Split(' '),
      int.Parse);

  static bool check(int[] pa, int[] pb) {
    int a = pa[0], b = pa[1], c = pb[0], d = pb[1];
    return b >= d && d >= c && c >= a;
  }

  static int Main(string[] args) {
    int n = invr() [0];
    List<int[]> points = new List<int[]>();
    for (int i = 0; i < n;) {
      int[] p = invr();
      points.Add(new int[] { p[0], p[1], ++i });
    }
    points.Sort((a, b) => a[1] > b[1] ? 1 : a[1] < b[1] ? -1 : a[0] > b[0] ? -1 : a[0] < b[0] ? 1 : 0);
    int ind1 = points[n - 1][2];
    points.Sort((a, b) => a[0] > b[0] ? -1 : a[0] < b[0] ? 1 : a[1] > b[1] ? 1 : a[1] < b[1] ? -1 : 0);
    int ind2 = points[n - 1][2];

    Console.WriteLine(ind1 == ind2 ? ind1 : -1);
    return 0;
  }
}
