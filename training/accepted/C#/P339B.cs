// Xenia and Ringroad - CodeForces
// Status: Accepted

using System;

class Program {

  static Func<int[]> invr =
    () => Array.ConvertAll(Console.ReadLine().Split(' '),
      int.Parse);

  // static int p = 1;

  static int move(int n, int o, int d) {

    return o <= d?d - o : n - o + d;
  }
  static int Main(string[] args) {
    int[] input = invr();
    int n = input[0], m = input[1];
    int[] a = invr();
    long c = 0;
    int p = 1;

    foreach (int i in a) {
      int mv = move(n, p, i);
      p = i;
      c += mv;
    }

    Console.WriteLine(c);

    return 0;
  }
}

//701800291
//4996767587
