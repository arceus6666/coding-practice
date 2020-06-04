
// Hata "a" - CodeForces
// Status: Accepted!

import java.util.Scanner;

public class P1146B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String t = sc.nextLine();
    if (t.replace("a", "").length() == 0) {
      System.out.println(t);
      System.exit(0);
    }
    if (!t.contains("a")) {
      String t1 = t.substring(0, (t.length() + 1) / 2);
      String t2 = t.substring((t.length() + 1) / 2);
      //System.out.println(t1 + "\n" + t2);
      if (t1.equals(t2)) {
        System.out.println(t1);
      } else {
        System.out.println(":(");
      }
      System.exit(0);
    }
    int i = t.length() - 1;
    while (i > 0 && t.charAt(i - 1) != 'a') {
      i--;
    }
    String s = t.substring(0, i);
    StringBuilder ss = new StringBuilder(t.substring(i));
    // System.out.println(s + "\n" + ss);
    String sa = s.replace("a", "");
    while (sa.length() < ss.length()) {
      char c = ss.charAt(0);
      sa += c;
      s += c;
      ss.deleteCharAt(0);
    }
    if (sa.length() == ss.length() && sa.equals(ss.toString())) {
      System.out.println(s);
    } else {
      System.out.println(":(");
    }

  }

}
