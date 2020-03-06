// decoding - codeforces
// accepted

// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

public class P746B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String coded = sc.nextLine();
    String inicio = "";
    String fin = "";
    for (int i = n - 1; i > 0; i -= 2) {
      inicio += coded.charAt(i - 1) + "";
      fin = coded.charAt(i) + fin;
    }
    if (n % 2 == 1) {
      inicio += coded.charAt(0);
    }
    System.out.println(inicio + fin);
    String res = "";
    // for (char ccc : c) {
    // res += ccc + "";
    // }
    System.out.println(res);
  }
}