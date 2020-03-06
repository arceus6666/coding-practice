// superhero transformation
// accepted

import java.util.Scanner;

public class P1111A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();
    System.out.println(check(s, t));
  }

  static boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }

  static String check(String s, String t) {
    int sl = s.length();
    int tl = t.length();
    if (sl != tl)
      return "No";
    for (int i = 0; i < sl; i++) {
      if (isVowel(s.charAt(i))) {
        if (!isVowel(t.charAt(i)))
          return "No";
      } else {
        if (isVowel(t.charAt(i)))
          return "No";
      }
    }
    return "Yes";
  }
}