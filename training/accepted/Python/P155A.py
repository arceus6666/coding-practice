# I_love_%username% - CodeForces
# accepted


import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def invr():
    return list(map(int, input().split()))


n = inp()
nn = invr()

m = nn[0]
M = m
a = 0

for i in range(1, n):
    x = nn[i]
    if x < m:
        m = x
        a += 1
        # print(i+1)
    elif x > M:
        M = x
        a += 1
        # print(i+1)

print(a)
