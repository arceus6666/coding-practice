# Rooms and Staircases - codeforces
# accepted

import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def intin():
    s = input()
    return list(map(int, s[:len(s)-1]))


t = inp()

while t > 0:
    t -= 1
    l = inp()
    n = intin()
    # print(l, n)
    if not 0 in n:
        print(l*2)
        continue
    if not 1 in n:
        print(l)
        continue

    s = [0]
    i = 0
    for e in n:
        if(e == 0):
            i += 1
        else:
            break
    d = 0
    for e in n[::-1]:
        if(e == 0):
            d += 1
        else:
            break
    print((l - (d if d < i else i)) * 2)
    #     if(e == 1):
    #         i += 1
    #         s.append(0)
    #     else:
    #         s[i] += 1
    #     # s = [int(d) for d in str(n)]

    # if s[0] == 0 or s[len(s)-1] == 0:
    #     print(l*2)
    #     continue
    # print(sum(s)+len(s)*2)

    # print(s)
