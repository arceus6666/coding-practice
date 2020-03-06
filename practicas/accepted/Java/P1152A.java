
// neko finds grapes - codeforces
// ACCEPTED!

import java.util.Scanner;

public class P1152A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // chests
    int n = sc.nextInt();
    // keys
    int m = sc.nextInt();
    int cp = 0, ci = 0;
    int kp = 0, ki = 0;

    for (int i = 0; i < n; i++) {
      int cn = sc.nextInt();
      if (cn % 2 == 0)
        cp++;
      else
        ci++;
    }
    for (int i = 0; i < m; i++) {
      int kn = sc.nextInt();
      if (kn % 2 == 0)
        kp++;
      else
        ki++;
    }

    int res = (cp > ki ? ki : cp) + (ci > kp ? kp : ci);

    System.out.println(res);
  }

}