# Parity Alternated Deletions
# accepted

import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def invr():
    return list(map(int, input().split()))


inp()

a = invr()

a.sort()
a.reverse()

cc = 0
s = 0
for e in a:
    s += e
    cc += 1 if e % 2 == 0 else -1

c = 1 if cc < 0 else 0

# a.pop(0)
l = len(a)
for ii in range(l):
    # print(a)
    for i, e in enumerate(a):
        if e % 2 == c:
            a.pop(i)
            s -= e
            c = not c
            break

print(s)
