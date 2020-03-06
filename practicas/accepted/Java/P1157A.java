
// Reachable numbers - codeforces
// ACCEPTED!

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1157A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> l = new ArrayList<Integer>();
    int x = f(n);
    while (!l.contains(x)) {
      l.add(x);
      x = f(x);
    }
    int res = l.size();
    if (!l.contains(n)) {//<- key
      res++;
    }
    System.out.println(res);
  }

  static int f(int x) {
    x++;
    while (x % 10 == 0) {
      x /= 10;
    }
    return x;
  }

}
