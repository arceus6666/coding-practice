// Reading - CodeForces
// Status: Accepted

using System;
using System.IO;

class Program {

  static Func<string, int[]> invr =
    (string line) => Array.ConvertAll(line.Split(' '),
      int.Parse);

  static int getIndex(int[] arr, int e, int from = 0) {
    for (int i = from; i < arr.Length; i++) {
      if (arr[i] == e) return i;
    }
    return -1;
  }

  static int[] filled(int size, bool human = false) {
    int[] r = new int[size];
    for (int i = 0; i < size; i++) {
      r[i] = human ? i + 1 : i;
    }
    return r;
  }

  static int[] slice(int[] arr, int init) {
    int[] r = new int[arr.Length - init];
    for (int i = init, j = 0; j < r.Length; i++, j++) {
      r[j] = arr[i];
    }
    return r;
  }

  static int[] slice(int[] arr, int init, int end) {
    int[] r = new int[end - init];
    for (int i = init, j = 0; j < r.Length; i++, j++) {
      r[j] = arr[i];
    }
    return r;
  }

  static int Main(string[] args) {
    StreamReader sr = File.OpenText(@"./input.txt");

    // /*
    int[] sc = invr(sr.ReadLine());
    int n = sc[0], k = sc[1];
    int[] a = invr(sr.ReadLine());
    int[] ind = filled(n, true);

    // Console.WriteLine(string.Join(" ", a));
    // Console.WriteLine(string.Join(" ", ind));
    for (int i = 0; i < n - 1; i++) {
      for (int j = n - 1; j > i; j--) {
        int aa = a[i];
        int bb = a[j];
        int ai = ind[i];
        int bi = ind[j];
        if (aa > bb) {
          a[i] = bb;
          a[j] = aa;
          ind[i] = bi;
          ind[j] = ai;
          j = n - 1;
        }
      }
    }

    ind = slice(ind, n - k);
    Array.Sort(ind);

    // Console.WriteLine(string.Join(" ", a));
    // Console.WriteLine(string.Join(" ", ind));
    // Console.WriteLine(a[n - k]);
    // sw.WriteLine(a[n - k]);
    // Console.WriteLine(string.Join(" ", ind));
    // sw.WriteLine(string.Join(" ", ind));
    File.WriteAllLines(@"./output.txt",
      new string[] { a[n - k] + "", string.Join(" ", ind) });

    // */
    return 0;
  }
}
