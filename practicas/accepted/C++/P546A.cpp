// Soldier and bananas
// Status: Accepted

#include <iostream>
using namespace std;

int sum(int, int = 0);

int main()
{
  int k, n, w;
  cin >> k >> n >> w;
  int r = (sum(w) * k) - n;
  if (r < 1)
  {
    cout << 0;
  }
  else
  {
    cout << r;
  }
}

int sum(int n, int s)
{
  if (n == 0)
  {
    return s;
  }
  else
  {
    return sum(n - 1, s + n);
  }
}
