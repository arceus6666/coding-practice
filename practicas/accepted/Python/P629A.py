# Far Relative’s Birthday Cake - CodeForces
# accepted

import math
import sys
input = sys.stdin.readline

# k taken n combination
# n!/k!(n-k)!


def inp():
    return int(input())


def insr():
    s = input()
    return list(s[:len(s) - 1])


def pair(n):
    return math.factorial(n) / (2 * math.factorial(n - 2))


n = inp()

c = 0
col = [0]*n
for i in range(n):
    cc = 0
    r = insr()
    for i, e in enumerate(r):
        if e == 'C':
            cc += 1
            col[i] += 1

    c += pair(cc) if cc > 2 else 1 if cc == 2 else 0

# print(col)
for e in col:
    c += pair(e) if e > 2 else 1 if e == 2 else 0

print(int(c))
