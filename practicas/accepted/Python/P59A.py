# Word - codeforces
# accepted

import math
import sys
input = sys.stdin.readline


def insr():
    s = input()
    return list(s[:len(s) - 1])


s = insr()

l, u = 0, 0
for e in s:
    if e.islower():
        l += 1
    else:
        u += 1
    # print(l, u)

if u > l:
    print(''.join(s).upper())
else:
    print(''.join(s).lower())
