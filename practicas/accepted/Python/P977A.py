# Wrong Subtraction - codeforces
# accepted

import math
import sys
input = sys.stdin.readline


def invr():
    return list(map(int, input().split()))


n, k = invr()

d = n % 10

while k > 0:
    if d == 0:
        n = int(n / 10)
        k -= 1
        d = n % 10
    else:
        if d > k:
            n -= k
            k = 0
        else:
            k -= d
            n -= d
            d = 0

print(n)
