// cAPS lOCK - CodeForces
// Status: Accepted

using System;

namespace ConsoleApp {
  class Program {

    static Func<string> insr =
      () => Console.ReadLine().ToString();

    static bool isLower(char c) {
      string s = c.ToString();
      return s == s.ToLower();
    }

    static string convert(string s) {
      char[] l = s.ToCharArray();
      for (int i = 0; i < l.Length; i++) {
        // Console.Write(l[i] + "->");
        // char c = l[i];
        // if (isLower(c)) {
        //   l[i] = (char) char.GetNumericValue(c) - 32;
        // } else {
        //   l[i] = (char) char.GetNumericValue(c) + 32;
        // }
        // int x = (int) l[i];
        l[i] = (char) ((int) l[i] + (isLower(l[i]) ? -32 : 32));
        // Console.Write(l[i] + ". ");
        // Console.WriteLine(x);
      }
      return new string(l);
    }

    static bool check(string s) {
      s = s.Remove(0, 1);
      return s == s.ToUpper();
    }

    static int Main(string[] args) {
      string s = insr();
      Console.WriteLine(check(s) ? convert(s) : s);
      return 0;
    }
  }
}
