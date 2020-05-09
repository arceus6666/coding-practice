# USB Flash Drives - codeforces
# accepted

import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


n = inp()
m = inp()
a = list(sorted([inp() for e in range(n)], reverse=True))

c = 0
for e in a:
    if(m <= 0):
        break
    # print(m,e)
    m -= e
    c += 1

print(c)
