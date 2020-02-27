
// chunga-changa - codeforces
// ACCEPTED!

import java.math.BigInteger;
import java.util.Scanner;

public class P1181A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger x = sc.nextBigInteger(); // a
    BigInteger y = sc.nextBigInteger(); // b
    BigInteger z = sc.nextBigInteger(); // costo
    BigInteger t = (x.add(y)).divide(z); // compra sin prestamo
    BigInteger modx = x.mod(z); // resto de a
    BigInteger mody = y.mod(z); // resto de b
    // System.out.println(modx + " " + mody);
    if (modx.compareTo(BigInteger.ZERO) == 0 || mody.compareTo(BigInteger.ZERO) == 0
        || modx.add(mody).abs().compareTo(z) < 0) {
      System.out.println(t + " " + 0);
    } else {
      BigInteger gx = z.subtract(modx);
      BigInteger gy = z.subtract(mody);
      // int t = (x + y) / z;
      // System.out.println(gx + " " + gy);
      // System.out.println(t + " " + gx<gy?gx:gy);
      System.out.println(t + " " + (gx.compareTo(gy) < 0 ? gx : gy));
      // 57 - 24163367 / 36 - 24163366
    }
  }

}
