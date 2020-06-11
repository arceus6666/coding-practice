// Letter - CodeForces
// Status: Accepted

using System;
using System.Collections.Generic;

class Program {

  static Func<string> insr =
    () => Console.ReadLine();

  static int Main(string[] args) {
    List<char> h = new List<char>(insr().Replace(" ", "").ToCharArray());
    List<char> t = new List<char>(insr().Replace(" ", "").ToCharArray());
    h.Sort();
    t.Sort();
    while (h.Count > 0 && t.Count > 0) {
      char a = t[0];
      char b = h[0];
      while (a != b) {
        // Console.WriteLine(a + " " + b + ", " + t.Count + " " + h.Count);
        h.RemoveAt(0);
        if (h.Count > 0) {
          b = h[0];
        } else {
          Console.WriteLine("NO");
          return 0;
        }
      }
      h.RemoveAt(0);
      t.RemoveAt(0);
    }
    // Console.WriteLine(h);
    // Console.WriteLine(t);
    if (t.Count != 0) {
      Console.WriteLine("NO");
    } else {
      Console.WriteLine("YES");
    }
    return 0;
  }
}
