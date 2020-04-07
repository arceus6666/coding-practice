import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
    }
    // List<Integer> pairs = new ArrayList<>();
    int max = 0;
    int q = 0;
    for (int i = 0; i < n - 1; i++) {
      int init = b[i];
      for (int j = i + 1; j < n; j++) {
        int end = b[j];
        int e = Math.abs(end - init);
        if (max < e) {
          max = e;
          q = 0;
        }
        if (e == max) {
          q++;
        }
      }
    }
    // for (Integer e : pairs) {
    // if (max < e) {
    // max = e;
    // q = 0;
    // }
    // if (e == max) {
    // q++;
    // }
    // }
    // for (Integer e : pairs) {
    // if (e == max) {
    // q++;
    // }
    // }
    // System.out.println(pairs.toString());
    System.out.println(max + " " + q);

  }

}
