// XORinacci - CodeForces
// Status: Unsolved

#include <iostream>
using namespace std;

// long f(long, long *);

int main()
{
  int cp;
  cin >> cp;
  for (; cp > 0; cp--)
  {
    long a, b, n;
    cin >> a >> b >> n;
    long mem[] = {a, b};
    long c = 2;
    long n2 = n;
    while (n2-- > 1)
    {
      mem[c] = mem[c - 1] ^ mem[c - 2];
      cout << mem[c] << "," << c << "," << n2 << endl;
      c++;
    }
    cout << mem[n] << endl;
  }
}
