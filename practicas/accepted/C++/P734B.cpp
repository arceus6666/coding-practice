// Anton and digits - CodeForces
// Status: Accepted

#include <iostream>
using namespace std;

int get256(int[]);
int get32(int[]);

int main()
{
  int n[4] = {};
  cin >> n[0] >> n[1] >> n[2] >> n[3];
  int n256 = get256(n);
  int n32 = get32(n);
  int r = n256 * 256;
  r += 32 * n32;
  cout << r << endl;
}

int get256(int *x)
{
  int r = 0;
  while (x[0] > 0 && x[2] > 0 && x[3] > 0)
  {
    x[0]--;
    x[2]--;
    x[3]--;
    r++;
  }
  return r;
}

int get32(int *x)
{
  int r = 0;
  while (x[0] > 0 && x[1] > 0)
  {
    x[0]--;
    x[1]--;
    r++;
  }
  return r;
}
