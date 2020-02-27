
// WERTYU - UVA
// ACCEPTED!

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P10082 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<Character, Character> qwerty = new HashMap<>();
    qwerty.put('W', 'Q');
    qwerty.put('E', 'W');
    qwerty.put('R', 'E');
    qwerty.put('T', 'R');
    qwerty.put('Y', 'T');
    qwerty.put('U', 'Y');
    qwerty.put('I', 'U');
    qwerty.put('O', 'I');
    qwerty.put('P', 'O');
    qwerty.put('[', 'P');
    qwerty.put(']', '[');
    qwerty.put('\\', ']');
    qwerty.put('S', 'A');
    qwerty.put('D', 'S');
    qwerty.put('F', 'D');
    qwerty.put('G', 'F');
    qwerty.put('H', 'G');
    qwerty.put('J', 'H');
    qwerty.put('K', 'J');
    qwerty.put('L', 'K');
    qwerty.put(';', 'L');
    qwerty.put('\'', ';');
    qwerty.put('X', 'Z');
    qwerty.put('C', 'X');
    qwerty.put('V', 'C');
    qwerty.put('B', 'V');
    qwerty.put('N', 'B');
    qwerty.put('M', 'N');
    qwerty.put(',', 'M');
    qwerty.put('.', ',');
    qwerty.put('/', '.');
    qwerty.put('1', '`');
    qwerty.put('2', '1');
    qwerty.put('3', '2');
    qwerty.put('4', '3');
    qwerty.put('5', '4');
    qwerty.put('6', '5');
    qwerty.put('7', '6');
    qwerty.put('8', '7');
    qwerty.put('9', '8');
    qwerty.put('0', '9');
    qwerty.put('-', '0');
    qwerty.put('=', '-');
    qwerty.put(' ', ' ');
    while (sc.hasNext()) {
      //System.out.println(l);
      String l = sc.nextLine();
      String s = "";
      for (int i = 0; i < l.length(); i++) {
        char c = qwerty.get(l.charAt(i));
        //System.out.print(c);
        s += c;
      }
      System.out.println(s);
    }
  }

}