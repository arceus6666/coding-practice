// team olympiad - codefroces
// accepted

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P490A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[3];
    List<Integer> uno = new ArrayList<>();
    List<Integer> dos = new ArrayList<>();
    List<Integer> tres = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      num[x - 1]++;
      switch (x) {
      case 1:
        uno.add(i + 1);
        break;
      case 2:
        dos.add(i + 1);
        break;
      default:
        tres.add(i + 1);
        break;
      }
    }

    // System.out.println(Arrays.toString(num));

    if (num[0] <= num[1] && num[0] <= num[2]) {
      // num0
      System.out.println(num[0]);
      for (int i = 0; i < num[0]; i++) {
        System.out.println(uno.remove(0) + " " + dos.remove(0) + " " + tres.remove(0));
      }
    } else if (num[1] <= num[2] && num[1] <= num[0]) {
      // num1
      System.out.println(num[1]);
      for (int i = 0; i < num[1]; i++) {
        System.out.println(uno.remove(0) + " " + dos.remove(0) + " " + tres.remove(0));
      }
    } else {
      // num2
      System.out.println(num[2]);
      for (int i = 0; i < num[2]; i++) {
        System.out.println(uno.remove(0) + " " + dos.remove(0) + " " + tres.remove(0));
      }
    }

  }
}
