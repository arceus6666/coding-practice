
class imprimir {
  public static void main(String[] args) { }
  /*
  
  # facts

  arrays/collections sort es suficientemente eficiente
  math.pow es suficientemente eficiente
  sc.hasNext(); para EOF
  math.max(a,b) y a > b ? a : b son casi iguales
  
  */
  /*
  
  # teoria

  C(n,k) // N tomados de a K // n!/[k!(n-k)!]
  para k=2 // (n(n-1)/2)

  *********************************************************************************

  # time complexity

  +------------+--------------+-----------------------------------------------+
  |    Big O   |     Name     |                    Examples                   |
  |  Notation  |              |                                               |
  +============+==============+===============================================+
  | O(1)       | Constant     | # Odd or Even number                          |
  |            |              | # Look-up table (on average)                  |
  +------------+--------------+-----------------------------------------------+
  | O(log n)   | Logarithmic  | # Finding element on sorted array with        |
  |            |              | binary search                                 |
  +------------+--------------+-----------------------------------------------+
  | O(n)       | Linear       | # Find max element in unsorted array          |
  |            |              | # Duplicates elements in array with hashmap   |
  +------------+--------------+-----------------------------------------------+
  | O(n log n) | Linearithmic | # Sorting elements in array with merge sort   |
  +------------+--------------+-----------------------------------------------+
  | O(n^2)     | Quadratic    | # Duplicate elements in array (naive)         |
  |            |              | # Sorting array with bubble sort              |
  +------------+--------------+-----------------------------------------------+
  | O(n^3)     | Cubic        | # 3 variables equation solver                 |
  +------------+--------------+-----------------------------------------------+
  | O(2^n)     | Exponential  | # Find all subsets                            |
  +------------+--------------+-----------------------------------------------+
  | O(n!)      | Factorial    | # Find all permutations of a given set/string |
  +------------+--------------+-----------------------------------------------+

  *********************************************************************************

  # java numbers

  +----------+--------+----------------------------+--------------------------------------+
  |          |  width |           minimum          |                 maximum              |
  +----------+--------+----------------------------+--------------------------------------+
  |  SIGNED                                                                               |
  +----------+--------+----------------------------+--------------------------------------+
  | byte:    |  8 bit |                       -128 |                       +127   (10^2)  |
  | short:   | 16 bit |                    -32 768 |                    +32 767   (10^4)  |
  | int:     | 32 bit |             -2 147 483 648 |             +2 147 483 647   (10^9)  |
  | long:    | 64 bit | -9 223 372 036 854 775 808 | +9 223 372 036 854 775 807   (10^18) |
  +----------+--------+----------------------------+--------------------------------------+
  | UNSIGNED                                                                              |
  +----------+--------+----------------------------+--------------------------------------+
  |  char    | 16 bit |                          0 |                    +65 535           |
  +----------+--------+----------------------------+--------------------------------------+
  
  *********************************************************************************
  
  # bitwise operators
  
  A = 0011 1100 = 60
  B = 0000 1101 = 13

  & and           // A & B = 0000 1100 = 12
  | or            // A | B = 0011 1101 = 61
  ^ xor           // A ^ B = 0011 0001 = 49
  ~ complemento   // ~A = 1100 0011 = -61
  << left shift   // A << 2 = 1111 0000 = 240
  >> right shift  // A >> 2 = 1111 = 15
  >>> zero fill rigth shift // A >>> 2 = 0000 1111 = 15
  
  *********************************************************************************
  
  # bit hacks
  
  #1. Check if the integer is even or odd.
  (x & 1) == 0 ? par : impar

  #2. Test if the n-th bit is set.
  x & (1<<n) ? n-th bit is set : n-th bit is not set
  
  #3. Set the n-th bit.
  x | (1<<n)
  
  #4. Unset the n-th bit.
  x & ~(1<<n)
  
  #5. Toggle the n-th bit.
  x ^ (1<<n)
  
  #6. Turn off the rightmost 1-bit.
  x & (x-1)
  
  #7. Isolate the rightmost 1-bit.
  x & (-x)
  
  #8. Right propagate the rightmost 1-bit.
  x | (x-1)
  
  #9. Isolate the rightmost 0-bit.
  ~x & (x+1)
  
  #10. Turn on the rightmost 0-bit.
  x | (x+1)
  
  *********************************************************************************
  
  # lexicographically compare strings
  
  s1.compareTo(s2);
  s1 > s2 -> +
  s1 = s2 -> 0
  s1 < s2 -> -
  
  *********************************************************************************
  
  # arrays
  
  max of array -> (int)
  
  *********************************************************************************
  
  # big integers
  
  b1.compareTo(b2);
  b1 > b2 -> +
  b1 = b2 -> 0
  b1 < b2 -> -
  
  *********************************************************************************
  */

  // factorial recursivo
  static long factorialRecursive(long n) {
    return n == 1 ? 1 : n * factorialRecursive(n - 1);
  }

  // factorial < 20
  // import java.util.stream.LongStream;
  static long factorialStreams(long n) {
    return LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b);
  }

  // factorial > 20
  // import java.math.BigInteger;
  static BigInteger getFactorial(int num) {
    BigInteger result = BigInteger.ONE;
    for (int i = 1; i <= num; i++)
      result = result.multiply(BigInteger.valueOf(i));
    return result;
  }

  // permutaciones iterativas
  // @param {s} string to permute
  // @return array with the permutations
  // devuelve array
  static String[] permutationIterative(String s) {
    List<String> perms = new ArrayList<>();
    perms.add(s.charAt(0) + "");
    for (int i = 1; i < s.length(); i++) {
      for (int j = perms.size() - 1; j >= 0; j--) {
        String str = perms.remove(j);
        for (int k = 0; k <= str.length(); k++) {
          perms.add(str.substring(0, k) + s.charAt(i) + str.substring(k));
        }
      }
    }
    return perms.toArray(new String[perms.size()]);
  }

  //permutaciones recursiva
  //devuelve array
  static String[] permutationRecursive(
    String candidate,
    String remaining,
    ArrayList<String> memo,
    int size
  ) {
    if (remaining.length() == 0) {
      memo.add(candidate);
    }
    for (int i = 0; i < remaining.length(); i++) {
      String newCandidate = candidate + remaining.charAt(i);
      String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
      permutationRecursive(newCandidate, newRemaining, memo, size);
    }
    return memo.toArray(new String[size]);
  }

  //permutations
  // @param str string to calculate permutation for 
  // @param l starting index 
  // @param r end index 
  static void permute(String str, int l, int r) {
    if (l == r)
      System.out.println(str);
    else {
      for (int i = l; i <= r; i++) {
        str = swap(str, l, i);
        permute(str, l + 1, r);
        str = swap(str, l, i);
      }
    }
  }

  // Swap Characters at position 
  // @param {a} string value 
  // @param {i} position 1 
  // @param {j} position 2 
  // @return swapped string 
  static String swap(String a, int i, int j) {
    char temp;
    char[] c = a.toCharArray();
    temp = c[i];
    c[i] = c[j];
    c[j] = temp;
    return new String(c);
  }

  //permutacion tamaño; int size = (int) factorial(length);

  // Sort string
  // @param {str} string to sort
  // @return sorted string
  // import java.util.Arrays;
  static String sort(String str) {
    char[] tmp = str.toCharArray();
    Arrays.sort(tmp);
    return new String(tmp);
  }

  // Sort string 2
  // @param {str} string to sort
  // @return sorted string
  static String sortStream(String str) {
    return str.chars()
      .sorted()
      .collect(
        StringBuilder::new,
        StringBuilder::appendCodePoint,
        StringBuilder::append
      ).toString();
  }

  // char to int
  // @param {c} char to convert
  static int charToInt(char c) {
    return c - '0';
  }

  // remove blank spaces from string
  // @param {s} string to fix
  static String trim(String s) {
    return s.replaceAll("\\s+", "");
  }

  // Split string in n chars
  // @param {s} string to split
  // @param {n} size to split
  // @return string splited
  static String[] splitByN(String s, int n) {
    return s.split(("(?<=\\G.{"+n+"})"));
  }

  // Reverse a string
  // @param {s} string to revert
  // @return reverted string
  static String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }
}

