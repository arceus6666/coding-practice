# Arrays
# accepted

import math
import sys
input = sys.stdin.readline


def invr():
    return list(map(int, input().split()))


invr()
k, m = invr()
a = invr()
b = invr()

aa = a[k-1]
bb = b[len(b)-m]

# print(aa, bb)
print("YES" if aa < bb else "NO")
