// games - codeforces
// accepted
#include <iostream>
using namespace std;

int main()
{
  int n;
  cin >> n;
  int home[n] = {};
  int guest[n] = {};
  for (int i = 0; i < n; i++)
  {
    cin >> home[i];
    cin >> guest[i];
  }
  int r = 0;
  for (int i = 0; i < n - 1; i++)
  {
    for (int j = i + 1; j < n; j++)
    {
      if (home[i] == guest[j])
      {
        r++;
      }
      if (guest[i] == home[j])
      {
        r++;
      }
    }
  }
  cout << r;
}