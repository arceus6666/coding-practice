
// Serval and bus - CodeForces
// Status: Accepted !
import java.util.Scanner;

public class P1153A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int[] s = new int[n];
    int[] d = new int[n];
    for (int line = 0; line < n; line++) {
      s[line] = sc.nextInt();
      d[line] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      while (s[i] < t)
        s[i] += d[i];
    }
    int ind = 0;
    int min = s[0];
    for (int i = 1; i < n; i++) {
      if (s[i] < min) {
        min = s[i];
        ind = i;
      }
    }
    System.out.println(ind + 1);
  }
}
