
// neko does math
// time limit

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1152C {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[] adiv = getDivisors(a);
    int[] bdiv = getDivisors(b);

    int gk = k;
    while (k > 0) {
      k--;
      BigInteger lcm = lcm(a + k, b + k, gcdThing(a + k, b + k));
      if (lcm.compareTo(min) < 1) {
        min = lcm;
        gk = k;
      }
    }
    System.out.println(gk);
  }

  private static int gcdThing(int a, int b) {
    while (b != 0) {
      int t = a;
      a = b;
      b = t % b;
    }
    return a;
  }

  static int[] getDivisors(int n) {
    int nn = (int) Math.sqrt(n);
    List<Integer> divs = new ArrayList<>();
    for (int i = 2; i <= nn; i++) {
      if (n % i == 0) {
        divs.add(i);
        divs.add(n / i);
      }
    }
    int[] res = new int[divs.size()];
    for (int i = 0; i < divs.size(); i++) {
      res[i] = divs.get(i);
    }
    return res;
  }
}