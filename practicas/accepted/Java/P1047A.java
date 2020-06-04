// Little c loves 3 - CodeForces
// Status: Accepted

import java.util.Arrays;
import java.util.Scanner;

public class P1047A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int mod = n % 3;
    int div = n / 3;
    // System.out.println(mod);
    int[] c = check(new int[] { div, div, div + mod });
    System.out.println(c[0] + " " + c[1] + " " + c[2]);
  }

  static int[] check(int[] nums) {
    // System.out.println(Arrays.toString(nums));
    int n1 = nums[0], n2 = nums[1], n3 = nums[2];
    int mod1 = nums[0] % 3, mod2 = nums[1] % 3, mod3 = nums[2] % 3;
    boolean m1 = mod1 == 0, m2 = mod2 == 0, m3 = mod3 == 0;
    if (!m1 && !m2 && !m3) {
      return nums;
    } else if (m1 && m2 && m3) {
      return check(new int[] { n1 - 1, n2 - 1, n3 + 2 });
    } else if (m1 && m2 && !m3) {
      return check(new int[] { n1 - 1, n2 + 1, n3 });
    } else if (m1 && !m2 && m3) {
      return check(new int[] { n1 - 1, n2, n3 + 1 });
    } else if (!m1 && m2 && m3) {
      return check(new int[] { n1, n2 - 1, n3 + 1 });
    } else if (!m1 && !m2 && m3) {
      return check(new int[] { n1 + 1, n2 + 1, n3 - 2 });
    } else if (!m1 && m2 && !m3) {
      return check(new int[] { n1 + 1, n2 - 2, n3 + 1 });
    } else {
      return check(new int[] { n1 - 2, n2 + 1, n3 + 1 });
    }

  }

}
