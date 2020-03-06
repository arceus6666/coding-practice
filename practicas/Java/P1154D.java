
// Walking robot - codeforces
// wrong answer

import java.util.Scanner;

public class P1154D {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), b = sc.nextInt(), a = sc.nextInt();
    // sc.nextLine();
    // char[] sun = sc.nextLine().replaceAll("\\s+", "").toCharArray();
    int res = 0;
    int al = a;
    for (; n > 0; n--) {
      // System.out.println("b = " + b + ", a = " + a);
      // System.out.println(sun[i]);
      if (a + b == 0) {
        break;
      }
      res++;
      // if (sun[i] == '1') {
      if (sc.nextInt() == 1) {
        if (b > 0) {
          b--;
          a += a < al ? 1 : 0;
        } else {
          a--;
        }
      } else {
        if (a > 0) {
          a--;
        } else {
          b--;
        }
      }
    }
    // System.out.println("b = " + b + ", a = " + a);
    System.out.println(res);
  }
}
