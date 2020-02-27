
// alex and a rhombus - codeforces
// ACCEPTED!

import java.util.Scanner;

public class P1180A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res = (2 * n * n) - (2 * n) + 1;
    System.out.println(res);
  }
}