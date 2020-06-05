// Codecraft III - CodeForces
// Status: Accepted

using System;

class Program {

  static Func<int> inp =
    () => int.Parse(Console.ReadLine());

  static Func<string> insr =
    () => Console.ReadLine();

  static string[] months = new string[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

  static int findInArray(string[] arr, string value) {
    for (int i = 0; i < arr.Length; i++) {
      string e = arr[i];
      if (e == value) return i;
    }
    return -1;
  }
  static int Main(string[] args) {
    int m = findInArray(months, insr());
    int k = (int) inp() % 12;
    // Console.WriteLine(m + " " + k);

    Console.WriteLine(m + k > 11 ? months[m + k - 12] : months[m + k]);

    return 0;
  }
}
