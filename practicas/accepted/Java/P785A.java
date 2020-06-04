// Anton and polyhedrons - CodeForces
// Status: Accepted

import java.util.Scanner;

public class P785A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int r = 0;
    for (int i = 0; i < n; i++) {
      char c = sc.nextLine().charAt(0);
      if (c == 'T')
        r += 4;
      else if (c == 'C')
        r += 6;
      else if (c == 'O')
        r += 8;
      else if (c == 'D')
        r += 12;
      else
        r += 20;
    }
    System.out.println(r);
  }
}
