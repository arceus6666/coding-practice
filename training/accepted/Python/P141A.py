# Amusing Joke - CodeForces
# accepted

import math
import sys
input = sys.stdin.readline


def insr():
    s = input()
    return list(s[:len(s) - 1])


a = insr()
b = insr()
c = insr()

# a = [char for char in a if char != '\n']
# b = [char for char in b if char != '\n']
# c = [char for char in c if char != '\n']

a.sort()
b.sort()
c.sort()

l = len(a) + len(b)
cc = 0

for x in a:
    if x in c:
        c.remove(x)
        cc += 1
for x in b:
    if x in c:
        c.remove(x)
        cc += 1

print('YES' if len(c) == 0 and cc == l else 'NO')
