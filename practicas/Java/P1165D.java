
// almost all divisors - codeforces
// wrong answer

import java.util.Scanner;

public class P1165D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int n = sc.nextInt();
      int[] d = new int[n];
      for (int i = 0; i < n; i++) {
        d[i] = sc.nextInt();
      }
      int x = getMax(d)*2;
      for (int i = 0; i < d.length; i++) {
        if (x % d[i] != 0) {
          x = -1;
          break;
        }
      }
      System.out.println(x);
      t--;
    }
  }

  static int getMax(int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      max = nums[i] > max ? nums[i] : max;
    }
    return max;
  }
}