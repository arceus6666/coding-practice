
// merge it! - codeforces
// wrong answer

import java.util.Scanner;

public class P1176B {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int n = sc.nextInt();
      int a = sc.nextInt();
      int tres = 0;
      for (int i = 1; i < n; i++) {
        if (a % 3 == 0) {
          tres++;
          a = sc.nextInt();
        } else {
          if (a / 3 > 0) {
            a /= 3;
            tres++;
          }
          a += sc.nextInt();
        }
      }
      if (a % 3 == 0)
        tres++;
      System.out.println(tres);
      t--;
    }
  }
}