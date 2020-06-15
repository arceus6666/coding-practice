# Translation - CodeForces
# accepted

import math
import sys
input = sys.stdin.readline


def insr():
    s = input()
    return list(s[:len(s) - 1])


s = insr()
t = list(reversed(insr()))

print('YES' if s == t else 'NO')
