# Bit++ - CodeForces
# accepted

import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


n = inp()
c = 0
while n > 0:
    o = input()
    if '+' in o:
        c += 1
    else:
        c -= 1
    n -=1
print(c)
