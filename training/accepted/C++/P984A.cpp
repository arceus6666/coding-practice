// Game - CodeForces
// Status: Accepted

#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin >> n;
  int x[n] = {};
  for (int i = 0; i < n; i++)
  {
    cin >> x[i];
  }
  int q = sizeof(x) / sizeof(x[0]);
  sort(x, x + q);
  cout << x[((n + 1) / 2) - 1];
}
