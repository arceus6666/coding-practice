# Inbox (100500) - codeforces
# accepted

import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def invr():
    return list(map(int, input().split()))


n = inp()
l = invr()
if not 1 in l:
    print(0)
    sys.exit(0)
if not 0 in l:
    print(n)
    sys.exit(0)
i = 0
s = 0
ll = [0]
ad = 0
while s < len(l):
    e = l[s]
    if e:
        ad = 1
        ll[len(ll)-1] += 1
    elif ad:
        ll.append(0)
        ad = 0
    s += 1
if not ll[len(ll)-1]:
    ll.pop()
print(sum(ll) + len(ll) - 1)
