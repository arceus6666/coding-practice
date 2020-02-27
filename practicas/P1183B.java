
// Equalize Prices - codeforces
// 

import java.util.Arrays;
import java.util.Scanner;

public class P1183B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    while (q > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }
      int[] num = minmax(a);
      int t = num[0] + num[1];
      int r = t;
      
      q--;
    }
  }

  static int[] minmax(int[] a) {
    int[] res = new int[2];

    for (int i = 0; i < a.length; i++) {
      if (a[i] < res[0])
        res[0] = a[i];
      if (a[i] > res[1])
        res[1] = a[i];
    }
    return res;
  }

}
