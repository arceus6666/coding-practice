// Even odds - CodeForces
// Status: Unsolved

import java.math.BigInteger;
import java.util.Scanner;

public class P318A {
  static BigInteger two = new BigInteger("2");
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger n = sc.nextBigInteger();
    // int n = sc.nextInt();
    BigInteger k = sc.nextBigInteger();
    // int k = sc.nextInt();
    BigInteger r = k.multiply(two);
    // int r = 2 * k;
    int b = k.compareTo((n.add(BigInteger.ONE)).divide(two));
    // if (k > n / 2) {
    if (b == 1) {
      // r -= (n & 1) == 1 ? n + 1 : n;
      r = r.subtract(n);
      if (isOdd(n)) {
        r = r.subtract(BigInteger.ONE);
      }
    } else {
      // r--;
      r = r.subtract(BigInteger.ONE);
    }
    System.out.println(r);
  }

  static boolean isOdd(BigInteger n) {
    return n.mod(two).equals(BigInteger.ONE);
  }
}
