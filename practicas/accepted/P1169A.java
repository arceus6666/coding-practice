//Circle Metro - CodeForces
// ACCEPTED!
import java.util.Scanner;

public class P1169A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(f(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
  }

  static String f(int n, int a, int x, int b, int y) {
    for (int i = 0; i < n; i++) {
      if (a == b)
        return "YES";
      if (a == x || b == y)
        break;
      if (a == n)
        a = 1;
      else
        a++;
      if (b == 1)
        b = n;
      else
        b--;
    }
    return "NO";
  }
}