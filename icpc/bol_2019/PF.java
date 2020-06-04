
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class PF {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    int t = sc.nextInt();
    System.out.println(t);
    while (t > 0) {
      int[] n = new int[] { 1, 1, 1, 1, 1, 1, 1, 1 };
      double r = sc.nextDouble();
      // System.out.println(sc.nextDouble());
      double[] res = eval(n);
      double prev = res[0] / res[1];
      // int fail = 1;
      for (int i = 0; i < 8;) {
        // System.out.println(i + ": " + n[i]);
        int[] nn = n.clone();
        nn[i]++;
        res = eval(nn);
        double next = res[0] / res[1];
        if (next > prev || next < r) {
          i++;
        } else {
          n[i]++;
          prev = next;
        }
        if (n[i] > 100) {
          i++;
        }
        // if ((res[0] / res[1]) > r) {
        // i++;
        // if (i < 8) {
        // n[i]++;
        // }
        // } else {
        // n[i]++;
        // res = eval(n);
        // }
        System.out.println(Arrays.toString(n));
      }
      System.out.println(res[0] + "/" + res[1]);
      t--;
    }
  }

  static double[] eval(int[] k) {
    double a = 1.0 / k[7];
    double b = 1.0 / (k[6] + a);
    double c = 1.0 / (k[5] + b);
    double d = 1.0 / (k[4] + c);
    double e = 1.0 / (k[3] + d);
    double f = 1.0 / (k[2] + e);
    double g = 1.0 / (k[1] + f);
    return new double[] { (k[0] * k[1]) + (k[0] * f) + 1, k[1] + f };
  }

}
