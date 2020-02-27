import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // while (sc.hasNextLine()) {

    // char[] s = sc.nextLine().toCharArray();
    // int res = 0;
    // for (int i = 0, j = 26; i < s.length; i++, j--) {
    // if (i > 0 && s[i] < s[i - 1]) {
    // res = 0;
    // break;
    // }
    // int n = lToN(s[i]);
    // res += n + ((n - j + i) * n);
    // }
    // System.out.println(res);
    // }
    int a = sc.nextInt();
    int b = sc.nextInt();

    while (a + b > 0) {

      String res = "";
      for (int i = a; i <= b; i++) {
        res += i + "";
      }
      // int[] r = new int[10];
      for (int i = 0; i < 9; i++) {
        char n = (char) (i + 48);
        int r = (int) res.chars().filter(c -> c == n).count();
        System.out.print(r + " ");
      }
      System.out.println(res.chars().filter(c -> c == '9').count());

      a = sc.nextInt();
      b = sc.nextInt();
    }

  }

  // static boolean okNum(BigInteger n) {
  // String s = n.toString() + "x";
  // for (int i = 0; i < s.length(); i++) {
  // String[] ss = s.split(s.charAt(i) + "");
  // // System.out.println(s.charAt(i) + ": " + Arrays.toString(ss) + ", " +
  // ss.length);
  // if (ss.length > 3)
  // return false;
  // }
  // return true;
  // }

  // static int lToN(char l) {
  // switch (l) {
  // case 'a':
  // return 1;
  // case 'b':
  // return 2;
  // case 'c':
  // return 3;
  // case 'd':
  // return 4;
  // case 'e':
  // return 5;
  // case 'f':
  // return 6;
  // case 'g':
  // return 7;
  // case 'h':
  // return 8;
  // case 'i':
  // return 9;
  // case 'j':
  // return 10;
  // case 'k':
  // return 11;
  // case 'l':
  // return 12;
  // case 'm':
  // return 13;
  // case 'n':
  // return 14;
  // case 'o':
  // return 15;
  // case 'p':
  // return 16;
  // case 'q':
  // return 17;
  // case 'r':
  // return 18;
  // case 's':
  // return 19;
  // case 't':
  // return 20;
  // case 'u':
  // return 21;
  // case 'v':
  // return 22;
  // case 'w':
  // return 23;
  // case 'x':
  // return 24;
  // case 'y':
  // return 25;
  // default:
  // return 26;
  // }
  // }

  // static int getAdd(int l) {
  // int v = 0;
  // for (int i = 0, t = 26; i < l; i++, t--) {
  // v += antiSum(t, i);
  // }
  // return v;
  // }

  // static int antiSum(int sum, int l) {
  // if (l == 0)
  // return sum;
  // return antiSum(sum + sum - 1, l - 1);
  // }

}