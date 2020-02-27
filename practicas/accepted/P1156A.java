
// Inscribed figures - codeforces
// ACCEPTED!
import java.util.Scanner;

public class P1156A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] f = new int[n];
    f[0] = sc.nextInt();
    for (int i = 1; i < n; i++) {
      int nx = sc.nextInt();
      if (f[i - 1] + nx == 5) {
        System.out.println("Infinite");
        System.exit(0);
      }
      f[i] = nx;
    }

    int res = points(f[0], f[1]);
    for (int i = 2; i < n; i++) {
      res += points(f[i - 1], f[i]);
      res -= check(f[i - 2], f[i - 1], f[i]);
    }
    System.out.println("Finite\n" + res);
  }

  static int points(int x, int y) {
    if (x == 2 || y == 2)
      return 3;
    return 4;
  }

  static int check(int a, int b, int c) {
    if (a == 3 && b == 1 && c == 2)
      return 1;
    return 0;
  }

}
