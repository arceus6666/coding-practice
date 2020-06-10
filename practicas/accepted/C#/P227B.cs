// Effective Approach - CodeForces
// Status: Accepted

using System;

class Program {

  static Func<int[]> invr =
    () => Array.ConvertAll(Console.ReadLine().Split(' '),
      int.Parse);

  static int[] fill(int size) {
    int[] r = new int[size];
    for (int i = 0; i < size;) {
      r[i] = ++i;
    }
    return r;
  }

  /*
  static int findIndex(int[] arr, int e) {
    // for (int i = 0; i < arr.Length; i++) {
    //   if (arr[i] == e) return i + 1;
    // }
    // return -1;
    int n = arr.Length;
    int[] iarr = new int[n];
    Array.Copy(arr, iarr, n);
    int[] ind = fill(n);
    for (int i = 0; i < n - 1; i++) {
      for (int j = n - 1; j > i; j--) {
        int a = iarr[i];
        int b = iarr[j];
        int ai = ind[i];
        int bi = ind[j];
        if (a > b) {
          iarr[i] = b;
          iarr[j] = a;
          ind[i] = bi;
          ind[j] = ai;
          j = n - 1;
        }
      }
    }
    int f = Array.BinarySearch(iarr, e);
    // Console.WriteLine("e:" + e + ",v:" + ind[f]);
    return ind[f];
  }
  */

  static int findIndex(int[] arr, int e) {
    int n = arr.Length;
    for (int i = 0, j = n - 1; i <= j; i++, j--) {
      int a = arr[i], b = arr[j];
      if (a == e) {
        return i + 1;
      }
      if (b == e) {
        return j + 1;
      }
    }
    return -1;
  }

  static int Main(string[] args) {
    int n = invr() [0];
    int[] mem = new int[n + 1];
    int[] a = invr();
    for (int i = 0; i < n; i++) {
      // Console.WriteLine(a[i] + " " + i);
      mem[a[i]] = i + 1;
    }
    int m = invr() [0];
    int[] b = invr();
    // int vc = 0, pc = 0;
    long[] c = new long[2];
    for (int i = 0; i < m; i++) {
      int e = b[i];
      // int ind;
      // if (mem[e] > 0) {
      int ind = mem[e];
      // Console.WriteLine(e + " from mem");
      // } else {
      //   ind = findIndex(a, b[i]);
      //   mem[e] = ind;
      // }
      c[0] += ind;
      c[1] += n - ind + 1;

    }
    Console.WriteLine(string.Join(" ", c));
    return 0;
  }
}
