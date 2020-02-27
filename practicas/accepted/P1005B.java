// delete from the left - codeforces
// accepted

import java.util.Scanner;

public class P1005B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = new StringBuilder(sc.nextLine()).reverse().toString();
    String t = new StringBuilder(sc.nextLine()).reverse().toString();

    // System.out.println(s + ":" + t + "," + s.equals(t));
    if (s.equals(t)) {
      System.out.println(0);
      System.exit(0);
    } else {
      s += ".";
      t += ",";
    }

    int i = 0;
    while (s.charAt(i) == t.charAt(i)) {
      i++;
    }
    System.out.println(s.length() + t.length() - 2 - (i * 2));
  }
}
