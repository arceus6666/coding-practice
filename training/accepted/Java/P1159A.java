
// A pile of stones - CodeForces
// Status: Accepted!

import java.util.Scanner;

public class P1159A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    int st = 0;
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == '+') {
        st++;
      } else if (st > 0) {
        st--;
      }
    }
    System.out.println(st);
  }

}
