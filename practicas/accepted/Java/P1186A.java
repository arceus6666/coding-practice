
// Vus the cossack and a contest - codeforcces
// Status: Accepted!

import java.util.Scanner;

public class P1186A {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();

    if (m < n || k < n) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}
