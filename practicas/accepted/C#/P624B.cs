// Making a String - CodeForces
// Status: Accepted

using System;

class Program {

  static Func<int[]> invr =
    () => Array.ConvertAll(Console.ReadLine().Split(' '),
      int.Parse);

  static void printArr<T>(T[] arr, string sep = " ") {
    Console.WriteLine(string.Join(sep, arr));
  }

  static int Main(string[] args) {
    int n = invr() [0];
    int[] a = invr();
    Array.Sort(a);
    Array.Reverse(a);
    // printArr(a);
    for (int i = 0; i < n - 1;) {
      int cur = a[i];
      int nx = a[++i];
      if (cur < nx) {
        a[i] = cur - 1 > 0 ? cur - 1 : 0;
      } else if (cur == nx) {
        a[i]--;
      }

    }
    // printArr(a);
    long c = 0;
    foreach (int e in a) {
      c += e;
    }

    Console.WriteLine(c);
    return 0;
  }
}
