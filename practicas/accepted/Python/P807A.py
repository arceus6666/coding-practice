# Is it rated? - codeforces
# accepted

import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def invr():
    return list(map(int, input().split()))


n = inp()
a, b = [], []
for i in range(n):
    ai, bi = invr()
    a.append(ai)
    b.append(bi)

if a != b:
    print('rated')
elif a == list(sorted(a, reverse=True)):
    print('maybe')
else:
    print('unrated')
# print(a, list(sorted(a)))
