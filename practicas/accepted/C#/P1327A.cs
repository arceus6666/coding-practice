// Sum of Odd Integers - CodeForces
// Status: Accepted

using System;

class Program {

  static Func<int> inp =
    () => int.Parse(Console.ReadLine());

  static Func<ulong[]> invr =
    () => Array.ConvertAll(Console.ReadLine().Split(' '),
      ulong.Parse);
  static int Main(string[] args) {
    int t = inp();

    while (t > 0) {
      ulong[] input = invr();
      string r = "NO";
      ulong n = input[0];
      ulong k = input[1]; // <- ulong importante
      // ulong ml = int.MaxValue*int.MaxValue;
      if (n >= k * k && k % 2 == n % 2) {
        r = "YES";
      }

      Console.WriteLine(r);
      t--;
    }
    return 0;
  }
}
