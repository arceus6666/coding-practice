// Set of Strings - CodeForces
// Status: Accepted

using System;
using System.Collections.Generic;

class Program {

  static Func<int> inp =
    () => int.Parse(Console.ReadLine());

  static Func<string> insr =
    () => Console.ReadLine();

  static string arrToString<T>(T[] arr, string sep = " ") {
    return string.Join(sep, arr);
  }

  static bool eInArr(char[] arr, char e) {
    foreach (char item in arr) {
      if (e == item) return true;
    }
    return false;
  }

  static string[] nDistinct(char[] arr, int n) {
    string[] r = new string[n];
    char[] h = new char[n];
    // Console.WriteLine(h.Length);
    // Console.WriteLine(arrToString(h, ","));
    List<char> list = new List<char>(arr);
    int l = list.Count;
    int i;
    // for (i = l - 1, j = n - 1; i > -1 && j > -1; i--) {
    for (i = 0; list.Count > 0 && i < n;) {
      char c = list[0];
      list.RemoveAt(0);
      // l--;
      if (!eInArr(h, c)) {
        r[i] = c.ToString();
        h[i] = c;
        // Console.WriteLine(j + " " + c + " " + r[j]);
        i++;
        // j++;
      } else {
        r[i - 1] += c.ToString();
        // Console.WriteLine(j + " " + c + " " + r[j]);
      }
      // Console.WriteLine(arrToString(r, ","));
    }
    // Console.WriteLine(i + " " + j);
    // Console.WriteLine(arrToString(list.ToArray()));
    if (i < n) {
      return null;
    }
    // if (i < list.Count) {
    r[n - 1] += string.Join("", list);
    // }
    return r;
  }

  static int Main(string[] args) {
    int k = inp();
    string s = insr();
    int l = s.Length;
    if (k > l) {
      Console.WriteLine("NO");
    } else if (k == 1) {
      Console.WriteLine("YES");
      Console.WriteLine(s);
    } else {
      string[] r = nDistinct(s.ToCharArray(), k);
      if (r == null) {
        Console.WriteLine("NO");
      } else {
        Console.WriteLine("YES");
        foreach (string e in r) {
          Console.WriteLine(e);
        }
      }
    }
    return 0;
  }
}
