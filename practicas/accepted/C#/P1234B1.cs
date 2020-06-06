// Social Network - CodeForces
// Status: Accept

using System;

class Program {

  static Func<int[]> invr =
    () => Array.ConvertAll(Console.ReadLine().Split(' '),
      int.Parse);

  static void print(int[] arr) {
    // Console.WriteLine("[" + string.Join(",", arr) + "]");
    Console.WriteLine(string.Join(" ", arr));
  }

  static void noZeroPrint(int[] arr) {
    string s = "";
    int l = arr.Length - 1;
    for (int i = 0; i < l; i++) {
      if (arr[i] > 0)
        s += arr[i] + " ";
    }
    Console.WriteLine(s + ((arr[l] > 0) ? arr[l] + "" : ""));
  }

  static int[] head(int[] arr, int e) {
    // print(arr);
    for (int i = arr.Length - 1; i > 0; i--) {
      // print(arr);
      arr[i] = arr[i - 1];
    }
    // print(arr);
    arr[0] = e;
    return arr;
  }

  static int size(int[] arr) {
    int s = 0;
    foreach (int e in arr) {
      if (e > 0) s++;
    }
    return s;
  }

  static int getIngex(int[] arr, int value) {
    for (int i = 0; i < arr.Length; i++) {
      int e = arr[i];
      if (e == value) return i;
    }
    return -1;
  }

  static int Main(string[] args) {
    int[] input = invr();
    int n = input[0], k = input[1];
    int[] id = invr();
    int[] s = new int[k];
    foreach (int e in id) {
      int ind = getIngex(s, e);
      // print(s);
      // Console.WriteLine(ind + " " + e);
      if (ind < 0) {
        s = head(s, e);
      }
    }
    Console.WriteLine(size(s));
    noZeroPrint(s);
    // print(s);
    // Console.WriteLine(string.Join(" ", head(id, 5)));
    return 0;
  }
}
