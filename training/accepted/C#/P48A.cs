// Rock-paper-scissors - CodeForces
// Status: Accepted

using System;

namespace ConsoleApp {
  class Program {

    static Func<string> insr =
      () => Console.ReadLine().Replace("\n", "").ToString();

    static bool twoEq(char a, char b, char c) {
      return !((a == b && b == c) || (a != b && a != c && b != c));
    }

    static bool check(char a, char b) {
      string s = new string(new char[] { a, b });
      return (s == "rs") || (s == "sp") || (s == "pr");
    }

    static int Main(string[] args) {
      char f = (insr() [0]);
      char m = (insr() [0]);
      char s = (insr() [0]);
      // if (!twoEq(f, m, s)) {
      //   Console.WriteLine("?");
      //   Environment.Exit(0);
      // }
      if (f == m && check(s, f)) {
        Console.WriteLine("S");
      } else if (f == s && check(m, f)) {
        Console.WriteLine("M");
      } else if (s == m && check(f, s)) {
        Console.WriteLine("F");
      } else {
        Console.WriteLine("?");
      }
      return 0;
    }
  }
}
