// QAQ - codeforces
// accepted

#include <iostream>
using namespace std;

int main()
{
  string s;
  cin >> s;
  int r = 0;
  int l = s.length();
  for (int i = 0; i < l - 2; i++)
  {
    if (s[i] == 'Q')
    {
      for (int j = i + 1; j < l - 1; j++)
      {
        if (s[j] == 'A')
        {
          for (int k = j + 1; k < l; k++)
          {
            if (s[k] == 'Q')
            {
              r++;
            }
          }
        }
      }
    }
  }
  cout << r << endl;
}
