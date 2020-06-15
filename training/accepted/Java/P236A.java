// Boy or girl - CodeForces
// Status: Accepted

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P236A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] cc = sc.nextLine().toCharArray();
    Set<String> s = new HashSet<>();
    for (char c : cc) {
      s.add(c + "");
    }
    System.out.println(s.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
  }
}
