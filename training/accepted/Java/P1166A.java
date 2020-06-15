
// Silent Classroom - Codeforces
// Status: Accepted!
import java.util.Scanner;

public class P1166A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int[] lt = new int[26];
    for (int i = 0; i < n; i++) {
      String s = sc.nextLine();
      lt[s.charAt(0) - 'a']++;
    }
    int res = 0;
    for (int i = 0; i < 26; i++) {
      int l = lt[i];
      if (l > 2) {
        int x = l / 2;
        int y = (l + 1) / 2;
        res += ((x * (x - 1)) / 2) + ((y * (y - 1)) / 2);
      }
    }
    System.out.println(res);
  }

}
