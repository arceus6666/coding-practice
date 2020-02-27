// chores - codeforces
// 

import java.util.Arrays;
import java.util.Scanner;

public class P169A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[] v = new int[n];
    for (int i = 0; i < n; i++) {
      v[i] = sc.nextInt();
    }
    Arrays.sort(v);
  }
}