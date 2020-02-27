
// Microtransactions - codeforces
// wrong answer

import java.util.Scanner;

public class P1165F1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // types
    int n = sc.nextInt();
    // offers
    int m = sc.nextInt();
    // orders
    int[] orders = new int[n];
    for (int i = 0; i < n; i++) {
      orders[i] = sc.nextInt();
    }
    // offers day
    int[] offersd = new int[m];
    // offers type
    int[] offerst = new int[1000];
    // List<Integer> ot = new ArrayList<>();
    // List<Integer> ot = Arrays.asList(offerst);
    for (int i = 0; i < m; i++) {
      // day
      offersd[i] = sc.nextInt();
      // type
      offerst[sc.nextInt()]++;
      // ot.add(sc.nextInt());
    }
    int res = 0;
    for (int i = 0; i < n; i++) {
      // res+=getBestDay(i+1, offersd, offerst);
      //System.out.print(offerst[i+1] + " " + orders[i]);
      //int inc = 0;
      if (offerst[i + 1] >= orders[i]) {
        res += orders[i];
        //inc = orders[i];
      } else {
        res += (2 * (orders[i] - offerst[i + 1])) + offerst[i + 1];
        //inc = (2 * (orders[i] - offerst[i + 1])) + offerst[i + 1];
      }
      //res+=inc;
      //System.out.println(" +" + inc + " "+res);
    }
    System.out.println(res);
  }
  
}