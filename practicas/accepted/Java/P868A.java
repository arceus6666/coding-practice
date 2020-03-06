// Bark to unlock - codeforces
// accepted

import java.util.Scanner;

public class P868A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String password = sc.nextLine();
    int n = sc.nextInt();
    String[] words = new String[n];
    for (int i = 0; i < n; i++) {
      words[i] = sc.next();
    }
    System.out.println(work(password, words, n));
  }

  static String work(String password, String[] words, int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        String s = words[i] + words[j];
        if (s.contains(password))
          return "YES";
      }
    }
    return "NO";
  }
}