// stickers and toys - codeforces
// 

#include <iostream>
using namespace std;

void work(int, int, int, int *);

int main()
{
  int cp;
  cin >> cp;
  for (int l = 0; l < cp; l++)
  {
    int n, s, t;
    cin >> n >> s >> t;
    int z[3] = {};
    work(n, s, t, z);
    // cout << z[0] << ", " << z[1] << ", " << z[2] << endl;
    cout << max(z[0], z[1]) + 1 << endl;
  }
}

void work(int e, int s, int t, int *arr)
{
  cout << "e: " << e << ", s: " << s << ", t: " << t << endl;
  if (e > 0)
  {
    if (t == s)
    {
      if (e == t + s)
      {
        arr[0] += s;
        arr[1] += t;
        work(0, 0, 0, arr);
      }
      else if (e == t)
      {
        arr[2]+=e;
        work(e - e, s - e, t - e, arr);
      }
      else
      {
        arr[0]++;
        arr[1]++;
        work(e - 2, s - 1, t - 1, arr);
      }
    }
    else
    {
      int m = (e + 1) / 2;
      if (t > s)
      {
        // cout << "m1: " << m << endl;
        arr[1] += m;
        work(e - m, s, t - m, arr);
      }
      else
      {
        // cout << "m0: " << m << endl;
        arr[0] += m;
        work(e - m, s - m, t, arr);
      }
    }
  }
}