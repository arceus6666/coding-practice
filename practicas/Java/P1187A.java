
// Stickers and Toys - codeforces
// 

import java.math.BigInteger;
import java.util.Scanner;

public class P1187A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    while (q > 0) {
      int n = sc.nextInt();
      int s = sc.nextInt();
      int t = sc.nextInt();
      if (s == t && s == n) {
        System.out.println(1);
      } else if (s == t && s == n / 2) {
        System.out.println(s + 1);
      } else {
        System.out.println(getEggs(n, s, t));
      }
      q--;
    }
  }

  static BigInteger getEggs(int n, int s, int t) {
    int a = 0;
    while (s + t + a != n) {
      s--;
      t--;
      a++;
    }
    // System.out.println(s + " " + t + " " + a);
    BigInteger m = (s >= t) ? BigInteger.valueOf(s).add(BigInteger.ONE) : BigInteger.valueOf(t).add(BigInteger.ONE);
    return m;
  }
}
