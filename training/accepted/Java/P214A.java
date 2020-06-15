// System of equations - CodeForces
// Status: Accepted

import java.util.Scanner;

public class P214A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int res = 0;
    for (int a = 0;; a++) {
      if (a > m || a * a > n)
        break;
      for (int b = 0;; b++) {
        if (b > n || b * b > m)
          break;
        int nn = (a * a) + b;
        int mm = a + (b * b);
        if (nn == n && mm == m) {
          res++;
          break;
        }
      }
    }
    System.out.println(res);

  }
}
