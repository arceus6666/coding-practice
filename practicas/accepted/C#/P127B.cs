// Canvas Frames - CodeForces
// Status: Accepted

using System;

class Program {

  static Func<int> inp =
    () => int.Parse(Console.ReadLine());

  static Func<int[]> invr =
    () => Array.ConvertAll(Console.ReadLine().Split(' '),
      int.Parse);

  static int max(int[] arr) {
    int max = arr[0];
    foreach (int e in arr) {
      if (e > max) max = e;
    }
    return max;
  }

  static int Main(string[] args) {
    int s = 0;
    int n = inp();
    int[] a = invr();
    int[] x = new int[max(a) + 1];

    foreach (int e in a) {
      x[e]++;
    }

    for (int i = 0; i < x.Length; i++) {
      x[i] /= 2;
    }

    foreach (int e in x) {
      s += e;
    }
    
    Console.WriteLine(s / 2);
    return 0;
  }
}
