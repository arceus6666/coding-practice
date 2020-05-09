# The New Year: Meeting Friends - codeforces
# accepted

import math
import sys
input = sys.stdin.readline


def invr():
    return list(map(int, input().split()))


x = invr()

x.sort()

print((x[1] - x[0]) + (x[2] - x[1]))
