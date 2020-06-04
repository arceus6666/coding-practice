
// Restoring Three Numbers - CodeForces
// Status: Accepted!

import java.util.Arrays;
import java.util.Scanner;

public class P1154A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] s = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
    Arrays.sort(s);
    int s4 = s[3];
    int[] a = { s4 - s[0], s4 - s[1], s4 - s[2] };
    int[] b = { s4 - s[1], s4 - s[2], s4 - s[0] };
    int[] c = { s4 - s[2], s4 - s[0], s4 - s[1] };
    int i = 0;
    while (i < 3) {
      if (allP(new int[] { a[i], b[i], c[i] }))
        break;
      i++;
    }
    System.out.println(a[i] + " " + b[i] + " " + c[i]);
  }

  static boolean allP(int[] n) {
    for (int i : n)
      if (i < 0)
        return false;
    return true;
  }
}
