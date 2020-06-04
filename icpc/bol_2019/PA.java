// A. A String Challenge

import java.util.*;
import java.util.stream.LongStream;

public class PA {
  public static void main(String[] args) {
    int tc;
    Scanner sc = new Scanner(System.in);
    for (tc = sc.nextInt(); tc > 0; tc--) {
      String s = sc.next();
      int k = sc.nextInt();
      int n = sc.nextInt();
      HashMap<String, String> rp = new HashMap<>();
      // System.out.println(s + "," + k + "," + n);
      for (int i = 0; i < k; i++) {
        String key = sc.next();
        String value = sc.next();
        rp.put(key, value);
      }
      for (int j = 0; j < n; j++) {
        String ns = "";
        for (int l = 0; l < s.length(); l++) {
          String key = s.charAt(l) + "";
          String val = rp.get(key);
          ns += val != null ? val : "";
        }
        if (ns.length() == 0)
          break;
        s = ns;
        // System.out.println(j + ": " + ns);
      }
      System.out.println(s.length());
    }
  }

}
