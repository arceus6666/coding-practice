
// Serval and Toy Bricks - codeforces
// ACCEPTED!

import java.util.Scanner;

public class P1153B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int b = sc.nextInt();
    // length, width, height
    // vista de frente
    int[] hj = new int[m];
    // vista de lado
    int[] hi = new int[n];
    // posiciones ocupadas
    int[][] h = new int[n][m];
    int[][] res = new int[n][m];
    for (int i = 0; i < m; i++) {
      hj[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      hi[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        h[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (h[i][j] == 1)
          res[i][j] = hi[i] < hj[j] ? hi[i] : hj[j];
      }
    }
    printMatrix(res);
  }

  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      int l = matrix[0].length - 1;
      for (int j = 0; j < l; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println(matrix[i][l]);
    }
  }
}