// Restoring password - CodeForces
// Status: Accepted

import java.util.ArrayList;
import java.util.Scanner;

public class P94A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // StringBuilder code = new StringBuilder(sc.nextLine());
    String[] password = sc.nextLine().split("(?<=\\G.{10})");
    ArrayList<String> n = new ArrayList<>();
    // String[] n = new String[10];
    for (int i = 0; i < 10; i++) {
      n.add(sc.nextLine());
    }
    String res = "";
    for (String string : password) {
      res += n.indexOf(string);
    }
    System.out.println(res);
  }
}
