// On Corruption and Numbers - codeforces
// time limit

import java.util.Scanner;

public class P397B {
  public static void main(String[] args) {

  }

  static void try1() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t > 0) {
      int n = sc.nextInt();
      int l = sc.nextInt();
      int r = sc.nextInt();
      int s = 0;
      boolean broke = false;
      // System.out.println("test: " + t);
      for (int j = r; j >= l && !broke; j--) {
        s = 0;
        // System.out.println("j: " + j);
        if (n == l || n == r) {
          s = n;
          break;
        }
        for (int i = j; s <= n && i >= l;) {
          // System.out.println(s + "," + i);
          if (s + i <= n) {
            s += i;
          } else if (s == n) {
            break;
          } else {
            i--;
          }
        }
        if (s == n) {
          break;
        }
      }
      if (s == n) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

      t--;
    }
  }

  static void try2() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t > 0) {
      int n = sc.nextInt();
      int l = sc.nextInt();
      int r = sc.nextInt();
      for (int i = l; l < r; i++) {
        if (n % i == 0) {
          System.out.println("Yes");
          break;
        }else if(false){
          
        }
      }
      t--;
    }
  }

}
