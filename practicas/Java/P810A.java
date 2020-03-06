// straigth a
// time limit

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * P810A
 */
public class P810A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double k = sc.nextDouble();
    List<Double> a = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      a.add(sc.nextDouble());
    }
    double aa = prom(a);
    int r = 0;
    while (round(aa) != k) {
      a.add(k);
      aa = prom(a);
      r++;
    }
    System.out.println(r);
  }

  static double prom(List<Double> a) {
    double s = 0.0;
    double si = a.size();
    for (Double n : a) {
      s += n;
    }
    return s / si;
  }

  static int round(double d) {
    int n = (int) (d * 10.0);
    return n % 10 > 4 ? (n / 10) + 1 : n / 10;
  }
}
