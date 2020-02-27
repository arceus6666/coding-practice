
// love "a" - codeforces
// ACCEPTED!

import java.util.Scanner;

public class P1146A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] s = sc.nextLine().toCharArray();
    int a = 0;
    int x = 0;
    for (int i = 0; i < s.length; i++) {
      if (s[i] == 'a') {
        a++;
      } else {
        x++;
      }
    }
    while (a <= x) {
      x--;
    }
    System.out.println(a + x);
  }

}