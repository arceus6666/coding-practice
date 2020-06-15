
// From hero to zero
// Status: Accepted!

import java.math.BigInteger;
import java.util.Scanner;

public class P1175A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      BigInteger n = sc.nextBigInteger();
      BigInteger k = sc.nextBigInteger();
      BigInteger steps = BigInteger.ZERO;
      while (n.compareTo(BigInteger.ZERO) != 0) {
        if (n.compareTo(k) < 0) {
          steps = steps.add(n);
          break;
        }
        if (isMod(n, k)) {
          n = n.divide(k);
          steps = steps.add(BigInteger.ONE);
        } else {
          BigInteger m = n.divide(k);
          if (m.compareTo(BigInteger.ZERO) > 0) {
            steps = steps.add(n.mod(k)).add(BigInteger.ONE);
            n = m;
          } else {
            n = n.subtract(BigInteger.ONE);
            steps = steps.add(BigInteger.ONE);
          }
        }
      }
      System.out.println(steps);
      t--;
    }
  }

  static boolean isMod(BigInteger n, BigInteger m) {
    return n.mod(m).compareTo(BigInteger.ZERO) == 0;
  }
}
