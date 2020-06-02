// Fox and Snake - codeforces
// accepted

using System;

namespace App {
  class App {

    static void Fill(string[, ] arr) {
      for (int i = 0; i < arr.GetLength(0); i++) {
        for (int j = 0; j < arr.GetLength(1); j++) {
          arr[i, j] = ".";
        }
      }
    }

    static void PrintM(object[, ] arr) {
      int n = arr.GetLength(0) - 1, m = arr.GetLength(1) - 1;
      string p = "";
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          p += arr[i, j];
        }
        p += arr[i, m] + "\n";
      }
      for (int j = 0; j < m; j++) {
        p += arr[n, j];
      }
      p += arr[n, m];
      Console.WriteLine(p);
    }

    static int Main(string[] args) {
      // int n = int.Parse(Console.Read());
      // int m = int.Parse(Console.Read());
      int[] input = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
      int n = input[0];
      int m = input[1];

      string[, ] s = new string[n, m];
      Fill(s);
      bool side = false;
      for (int i = 0; i < n; i++) {
        if (i % 2 == 0) {
          for (int j = 0; j < m; j++) {
            s[i, j] = "#";
          }
        } else {
          s[i, side ? 0 : m - 1] = "#";
          side = !side;
        }
      }

      PrintM(s);
      return 0;
    }
  }
}
