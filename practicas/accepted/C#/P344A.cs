// Magnets - codeforces
// accepted

using System;

namespace App {
  class App {
    static int Main(string[] args) {
      int n = int.Parse(Console.ReadLine());
      int prem = int.Parse(Console.ReadLine());
      int g = 1;

      for (int i = 1; i < n; i++) {
        int m = int.Parse(Console.ReadLine());
        if (m != prem) {
          g += 1;
          prem = m;
        }
      }

      Console.WriteLine(g);
      return 0;
    }
  }
}
