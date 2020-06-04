// B. Bags

// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;
import java.util.Scanner;
import java.util.stream.LongStream;

public class PB {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    while (tc > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      int[] days = new int[n + 1];
      for (int i = 0; i < m; i++) {
        String p = sc.next();
        switch (p) {
        case "Q":
          int f = sc.nextInt();
          int t = sc.nextInt();
          int v = 0;
          for (int j = f; j <= t; j++) {
            v += days[j];
          }
          // System.out.println("q:" + v);
          System.out.println(v);
          break;
        case "W":
          int[] r = new int[n + 1];
          for (int j = 0; j <= n; j++) {
            if (days[j] == 0)
              continue;
            r[days[j]]++;
          }
          int count = 0;
          // System.out.println(Arrays.toString(r));
          int rps = 0;
          for (int pair : r) {
            count += pair > 0 ? pair : 0;
            long fc = factorial(pair);
            rps += fc > 1 ? fc : 0;
          }
          count = (int) factorial(count);
          // System.out.println("c:" + rps);
          count /= rps > 0 ? rps : 1;
          // System.out.println("W:" + count);
          System.out.println(count);
          break;
        case "U":
          int d = sc.nextInt();
          int b = sc.nextInt();
          days[d] += b;
          break;
        default:
          break;
        }
      }
      tc--;
    }
  }

  public static long factorial(int n) {
    return LongStream.rangeClosed(1, n).reduce(1, (long x, long y) -> x * y);
  }
}
