
// Eating Soup - Codeforces
// ACCEPTED!

import java.util.Scanner;

public class P1163A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    //runtime error
    // if (n - m <= 1) {
    /// System.out.println(1);
    // } else if (m == n) {
    // System.out.println(0);
    // } else {
    // int[] g = new int[n];
    // for (int i = 0; m > 0; i += 2) {
    // g[i] = 1;
    // m--;
    // }
    // System.out.println(Arrays.toString(g));
    // int res = 1;
    // int sep = 1;
    // for (int i = 1; i < n - 1; i++) {
    // if (sep == g[i]) {
    // res++;
    // }
    // }
    // System.out.println(res);
    // }
    if (n == m) {
      System.out.println(0);
    } else if (n - m == 1 || m == 0) {
      System.out.println(1);
    } else if ((n / 2) < m) {
      System.out.println(n - m);
    } else {
      System.out.println(m);
    }
  }
}
