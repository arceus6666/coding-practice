// Technogoblet of Fire - CodeForces
// Status: Accepted

using System;

class Program {

  static Func<int[]> invr =
    () => Array.ConvertAll(Console.ReadLine().Split(' '),
      int.Parse);

  static string ats<T>(T[] arr, string sep = " ") {
    return string.Join(sep, arr);
  }

  static int Main(string[] args) {
    int[] nmk = invr();
    int n = nmk[0];
    int m = nmk[1];
    int[] p = invr();
    int[] s = invr();
    int[] c = invr();
    int[] ind = new int[n];
    for (int i = 0; i < n;) {
      ind[i] = ++i;
    }

    int[] best = new int[m];

    // Console.WriteLine(ats(p));
    // Console.WriteLine(ats(s));
    // Console.WriteLine(ats(ind));

    for (int i = 0; i < n - 1; i++) {
      for (int j = n - 1; j > i; j--) {
        int a = p[i];
        int b = p[j];
        int sa = s[i];
        int sb = s[j];
        int ia = ind[i];
        int ib = ind[j];
        if (sa > sb) {
          p[i] = b;
          p[j] = a;
          s[i] = sb;
          s[j] = sa;
          ind[i] = ib;
          ind[j] = ia;
          j = n - 1;
        } else if (sa == sb && a > b) {
          p[i] = b;
          p[j] = a;
          s[i] = sb;
          s[j] = sa;
          ind[i] = ib;
          ind[j] = ia;
          // j = n - 1;
        }
      }
    }

    best[0] = ind[n - 1];
    int mn = m;
    // Console.WriteLine(mn);
    // for (int i = 1; i < m; i++) {
    for (int j = n - 2, i = 1; j > -1 && i < m; j--) {
      int e = s[j];
      // Console.WriteLine(e + " " + j);
      if (e != mn) {
        best[i++] = ind[j];
        mn--;
      }
    }
    // }

    // Console.WriteLine();
    // Console.WriteLine(ats(p));
    // Console.WriteLine(ats(s));
    // Console.WriteLine(ats(ind));
    // Console.WriteLine(ats(best));

    long count = 0;
    for (int i = 0; i < nmk[2]; i++) {
      int e = c[i];
      int ii = Array.FindIndex(best, x => x == e);
      // Console.WriteLine(ii);
      if (ii < 0) {
        count++;
      }
    }

    Console.WriteLine(count);

    return 0;
  }
}
