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

// char to int
char c = 'a';
int i = (int) c;

// multiplicaciones que superen el limite de int deben tener un tipo más grande antes de multiplicarlos
