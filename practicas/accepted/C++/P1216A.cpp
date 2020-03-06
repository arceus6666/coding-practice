// prefixes - codeforces
// accepted

#include <iostream>
using namespace std;

int main()
{
  int n;
  cin >> n;
  string s, r;
  cin >> s;
  r = s;
  int c = 0;
  for (int i = 0; i < n; i += 2)
  {
    char a = s[i];
    char b = s[i + 1];
    if (a == b)
    {
      r[i] = 'a';
      r[i + 1] = 'b';
      c++;
    }
  }
  cout << c << endl << r << endl;
}