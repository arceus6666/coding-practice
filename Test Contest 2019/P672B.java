// Different is Good
// ACCEPTED!

import java.util.*;

public class P672B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    Set<Character> unique = new HashSet<Character>();
    for(int i = 0; i < n; i++){
      unique.add(s.charAt(i));
    }
    int pos = 26 - unique.size();
    int req = n - unique.size();
    if(pos < req)
      System.out.println("-1");
    else
      System.out.println(req);
  }
}