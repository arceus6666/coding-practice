// Cards - CodeForces
// Status: Accepted

// import java.util.Arrays;
import java.util.Scanner;

public class P1220A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    sc.nextLine();
    char[] cc = sc.nextLine().toCharArray();
    // [z,n]
    int[] l = new int[] { 0, 0 };
    for (char c : cc) {
      if (c == 'z') {
        l[0]++;
      } else if (c == 'n') {
        l[1]++;
      } else {
        continue;
      }
    }
    String r = "";
    for (int i = l[1]; i > 0; i--) {
      r += "1 ";
    }
    for (int i = l[0]; i > 0; i--) {
      r += "0 ";
    }
    System.out.println(r.trim());
  }
}
