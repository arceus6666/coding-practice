# Romaji - codeforces
# accepted

import math
import sys
input = sys.stdin.readline


def insr():
    s = input()
    return list(s[:len(s) - 1])


s = insr()

i = 0

if not s[len(s)-1] in 'aeioun':
    print('NO')
    sys.exit(0)

while i < len(s)-1:
    e = s[i]
    ee = s[i + 1]
    # print(e,ee,e in 'aeioun',ee in 'aeioun')
    if not e in 'aeioun':
        if not ee in 'aeiou':
            print('NO')
            sys.exit(0)
        else:
            i += 1
    i += 1
    # print(i)

print('YES')
