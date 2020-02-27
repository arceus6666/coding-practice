// Ehab and another construction problem - codeforces
// accepted

import java.util.Scanner;

public class P1088A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(work(sc.nextInt()));
  }

  static String work(int x) {
    int a, b;
    for (a = 1;; a++) {
      for (b = 1;; b++) {
        boolean b1 = a % b == 0;
        boolean b2 = a * b > x;
        boolean b3 = a / b < x;
        if (b1 && b2 && b3)
          return a + " " + b;
        if (!b1 && !b2 && !b3)
          continue;
        if (b >= x) {
          break;
        }
      }
      if (a >= x) {
        return "-1";
      }
    }
  }
}