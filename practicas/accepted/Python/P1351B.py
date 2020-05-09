# Square? - codeforces
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
    c, d = invr()
    o = [
        a == c and a == d + b,
        a == d and a == c + b,
        b == c and b == d + a,
        b == d and b == c + a
    ]
    oo = o[0]
    for x in range(1, 4):
        oo = oo or o[x]
    print('YES' if oo else 'NO')
    t -= 1
