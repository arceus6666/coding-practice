# Divisibility Problem - CodeForces
# accepted

import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def invr():
    return list(map(int, input().split()))


t = inp()

while t > 0:
    a, b = invr()
    print(0 if a % b == 0 else (((int) (a / b) + 1) * b) - a)
    t -= 1
