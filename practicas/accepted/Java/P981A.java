// Antipalindrome - CodeForces
// Status: Accepted

import java.util.Scanner;

class P981A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    if (!isPalindrome(word)) {
      System.out.println(word.length());
    } else {
      while (isPalindrome(word) && word.length() > 0) {
        word = word.substring(0, word.length() - 1);
      }
      System.out.println(word.length());
    }
  }

  static boolean isPalindrome(String s) {
    String r = new StringBuilder(s).reverse().toString();
    return s.equals(r);
  }
}
