
//Telephone Number - Codeforces
//ACCEPTED!

import java.util.*;

public class P1167A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t > 0) {
      int n = sc.nextInt();
      sc.nextLine();
      String s = sc.nextLine();
      int[] ss = new int[s.length()];
      for (int i = 0; i < s.length(); i++) {
        ss[i] = Integer.parseInt(s.charAt(i) + "");
      }
      int pos = 0;
      for (int i = 0; i < ss.length; i++) {
        if (ss[i] == 8)
          break;
        pos++;
      }
      if (ss.length - pos >= 11) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
      t--;
    }
  }

}