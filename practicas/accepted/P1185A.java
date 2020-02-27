
// ropewalkers - codeforces
// ACCEPTED!

import java.util.Arrays;
import java.util.Scanner;

public class P1185A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] abc = new int[3];
    abc[0] = sc.nextInt();
    abc[1] = sc.nextInt();
    abc[2] = sc.nextInt();
    int d = sc.nextInt();
    Arrays.sort(abc);
    int left = abc[1] - abc[0] < d ? d - abc[1] + abc[0] : 0;
    int right = abc[2] - abc[1] < d ? d - abc[2] + abc[1] : 0;
    System.out.println(left + right);
  }

}