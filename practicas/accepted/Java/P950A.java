// left-handers, right-handers and ambidexters - codeforces
// accepted

import java.util.Scanner;

public class P950A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int r = sc.nextInt();
    int a = sc.nextInt();
    int res = 0;
    // int dif = Math.abs(l - r);
    if (l > r) {
      if (l - r > a) {
        res = r + a;
      } else {
        res = l + ((a - l + r) / 2);
      }
    } else if (r > l) {
      if (r - l > a) {
        res = l + a;
      } else {
        res = r + ((a - r + l) / 2);
      }
    } else {
      res = l + (a / 2);
    }
    System.out.println(res * 2);
  }
}
