
// divide it! - codeforces
// ACCEPTED!

import java.math.BigInteger;
import java.util.Scanner;

public class P1176A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    BigInteger TWO = new BigInteger("2");
    BigInteger TRHEE = new BigInteger("3");
    BigInteger FOUR = new BigInteger("4");
    BigInteger FIVE = new BigInteger("5");
    while (q > 0) {
      BigInteger n = sc.nextBigInteger();
      int steps = 0;
      while (n.compareTo(BigInteger.ONE) > 0) {
        //System.out.println(n);
        if (isMod(n, FIVE)) {
          //System.out.println("mod 5");
          n = n.multiply(FOUR).divide(FIVE);
          steps++;
        } else if (isMod(n, TRHEE)) {
          //System.out.println("mod 3");
          n = n.multiply(TWO).divide(TRHEE);
          steps++;
        } else if (isMod(n, TWO)) {
          //System.out.println("mod 2");
          n = n.divide(TWO);
          steps++;
        } else {
          steps = -1;
          break;
        }
      }
      System.out.println(steps);
      q--;
    }
  }

  static boolean isMod(BigInteger n, BigInteger m) {
    return n.mod(m).compareTo(BigInteger.ZERO) == 0;
  }

}