//take inputs

using System;

// For taking integer inputs
static Func<int> inp =
  () => int.Parse(Console.ReadLine());

// space separated integer inputs
static Func<int[]> invr =
  () => Array.ConvertAll(Console.ReadLine().Split(' '),
    int.Parse);

// For taking string inputs
static Func<string> insr =
  () => Console.ReadLine();

// space separated string input
static Func<string[]> inlt =
  () => Console.ReadLine().Split(' ');

// array to string
static string arrToString<T>(
  T[] arr,
  string sep = " ",
  bool arrForm = false
) {
  if (arrForm)
    return "[" + string.Join(",", arr) + "]";
  return string.Join(sep, arr);
}
// char to int
char c = 'a';
int i = (int) c;

// sort con index
static void sortIndex() {
  T[] arr = new T[];
  int[] ind = new int[];
  for (int i = 0; i < n - 1; i++) {
    for (int j = n - 1; j > i; j--) {
      T a = arr[i];
      T b = arr[j];
      int ai = ind[i];
      int bi = ind[j];
      if (a > b) {
        arr[i] = b;
        arr[j] = a;
        ind[i] = bi;
        ind[j] = ai;
        j = n - 1;
      }
    }
  }
}

// multiplicaciones que superen el limite de int deben tener un tipo más grande antes de multiplicarlos
