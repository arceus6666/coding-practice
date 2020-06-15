// Playing with dice - CodeForces
// Status: Accepted

#include <iostream>
using namespace std;

int main()
{
  int a, b;
  cin >> a >> b;
  int r[3] = {};
  for (int i = 1; i < 7; i++)
  {
    int ad = abs(a - i);
    int bd = abs(b - i);
    int m = min(ad, bd);
    if (m == bd)
    {
      if (m == ad)
        r[1]++;
      else
        r[2]++;
    }
    else
    {
      r[0]++;
    }
  }
  cout << r[0] << " " << r[1] << " " << r[2] << endl;
}
