# Divisors of Two Integers - CodeForces
# accepted

import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def invr():
    return list(map(int, input().split()))


n = inp()
d = invr()
d.sort(reverse=1)


c = [0] * (d[0] + 1)
a = d.pop(0)
c[a] = 1
b = None
al = -1
bl = -1
# print(d)

# print(len(d))
# i = 1
two = 1
for e in d:
    # print(e,a % e == 0,c[e],b)
    # if not (a % e == 0 and not c[e]):
    if (a % e != 0 or c[e]):
        b = e
        break
    c[e] = 1


print(a, b)
