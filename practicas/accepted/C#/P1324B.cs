// Yet Another Palindrome Problem - CodeForces
// Status: Accepted

using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;

class Program {

  static Func<int[]> invr =
    () => Array.ConvertAll(Console.ReadLine().Split(' '),
      int.Parse);

  static bool isPalindrome(int[] arr) {
    int l = arr.Length;
    for (int i = 0; i < (l + 1) / 2; i++) {
      if (arr[i] != arr[l - i - 1]) return false;
    }
    return true;
  }

  static bool isPartialPalindrome(int[] arr) {
    int n = arr.Length;
    // Console.WriteLine(string.Join(" ", arr));
    for (int s = n; s > 2; s--) {
      // Console.WriteLine("s:" + s);
      for (int i = 0, j = s - 1; j < n; i++, j++) {
        // Console.WriteLine("i:" + i + ",j:" + j);
        if (arr[i] == arr[j]) return true;
      }
    }
    return false;
  }
  /*
    private static bool NextCombination(IList<int> num, int n, int k) {
      bool finished;
      var changed = finished = false;
      if (k <= 0) return false;
      for (var i = k - 1; !finished && !changed; i--) {
        if (num[i] < n - 1 - (k - 1) + i) {
          num[i]++;
          if (i < k - 1)
            for (var j = i + 1; j < k; j++)
              num[j] = num[j - 1] + 1;
          changed = true;
        }
        finished = i == 0;
      }
      return changed;
    }

    private static IEnumerable Combinations<T>(IEnumerable<T> elements, int k) {
      var elem = elements.ToArray();
      var size = elem.Length;
      if (k > size) yield break;
      var numbers = new int[k];
      for (var i = 0; i < k; i++)
        numbers[i] = i;
      do {
        yield return numbers.Select(n => elem[n]);
      } while (NextCombination(numbers, size, k));
    }
  */
  static int Main(string[] args) {
    int t = invr() [0];
    while (t-- > 0) {
      int n = invr() [0];
      int[] a = invr();
      int[] b = new int[n];
      Array.Copy(a, b, n);
      // Console.WriteLine(string.Join(" ", a));
      Array.Sort(b);
      // Console.WriteLine(string.Join(" ", b));
      // if () {
      Console.WriteLine(isPartialPalindrome(a) ? "YES" : "NO");
      // } else if (a == b) {
      //   Console.WriteLine("NO");
      // } else {
      // bool breakFor = false;
      // for (int i = n - 1; i > 2 && !breakFor; i--) {
      //   foreach (IEnumerable<int> ie in Combinations(a, i)) {
      //     if (isPartialPalindrome(ie.ToArray())) {
      //       Console.WriteLine("YES");
      //       breakFor = true;
      //       break;
      //     }
      //   }
      //   // Console.WriteLine(string.Join(" ", i));
      // }
      // if (!breakFor) {
      //   Console.WriteLine("NO");
      // }
      // Console.WriteLine("NO");
      // }
    }
    return 0;
  }
}
