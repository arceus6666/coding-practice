# Sorted Adjacent Differences - codeforces
#

import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def invr():
    return list(map(int, input().split()))


t = inp()
while t > 0:
    l = inp()
    n = invr()
    n.sort()
    print(n)
    ne = []
    p = n[:]
    while p[0] < 0:
        ne.insert(0, p.pop(0))
    # else:
    # print(' '.join(map(str, n)))
    print(ne, p)

    t -= 1
