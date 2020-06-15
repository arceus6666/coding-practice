// important exam - CodeForces
// Status: Accepted

import java.util.Arrays;
import java.util.Scanner;

public class P1201A {
  public static void main(String[] args) {
    // A -> 65 E -> 69
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    sc.nextLine();
    String[] s = new String[n];
    for (int i = 0; i < n; i++) {
      s[i] = sc.nextLine();
    }
    int[] v = new int[m];
    for (int i = 0; i < m; i++) {
      v[i] = sc.nextInt();
    }
    int res = 0;
    for (int i = 0; i < m; i++) {
      int[] o = new int[5];
      for (int j = 0; j < n; j++)
        o[s[j].charAt(i) - 'A']++;
      Arrays.sort(o);
      res += o[4] * v[i];
    }
    System.out.println(res);
  }
}
