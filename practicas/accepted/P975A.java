// Aramic script - codeforces
// Accepted

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class P975A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashSet<String> w = new HashSet<>();
    for (int i = 0; i < n; i++) {
      char[] cc = sc.next().toCharArray();
      Arrays.sort(cc);
      StringBuilder sb = new StringBuilder();
      new String(cc).chars().distinct().forEach(c -> sb.append((char) c));
      w.add(sb.toString());
    }
    System.out.println(w.size());
  }
}
