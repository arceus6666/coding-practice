
// Nearest Interesting Number - codeforces
// ACCEPTED!

import java.util.Scanner;

public class P1183A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int n = getSum(a);
    while (n % 4 != 0) {
      //a++;
      n = getSum(++a);
    }
    System.out.println(a);
  }

  static int getSum(int n) {
    return (n / 1000) + ((n / 100) % 10) + ((n / 10) % 10) + (n % 10);
  }

}
