# Thanos Sort - CodeForces
# accepted

import math, sys
input = sys.stdin.readline

def inp():
    return int(input())

def invr():
    return list(map(int, input().split()))

def sorted(a):
    prev = a[0]
    for i in range(1, len(a)):
        if a[i] < prev: return 0
        else: prev = a[i]
    return 1

n = inp()
a = invr()
if sorted(a):
    print(len(a))
else:
    b = [a]
    s = []
    #for i, e in enumerate(b):
    i = 0
    while i < len(b):
        e = b[i]
        r = b.pop(i)
        if sorted(e):
            s.append(e)
            i -= 1
        else:
            mid = int(len(r) / 2)
            b.append(r[:mid])
            b.append(r[mid:])
            i = -1
        i += 1
    #print(s)
    #print(b)
    g = len(s[0])

    for i in s:
        if len(i) > g:
            g = len(i)
    print(g)
