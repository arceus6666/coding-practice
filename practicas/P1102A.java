// integer sequence dividing - codeforces
// time limit

import java.util.Scanner;

public class P1102A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0, b = n, x = 0;
    boolean side = false;
    for (int i = n - 1; i > 0; i--) {
      if (side) {
        b += i;
      } else {
        a += i;
      }
      if (x < 1) {
        x++;
      } else {
        x = 0;
        side = !side;
      }
    }
    System.out.println(a < b ? b - a : a - b);
  }
}