# Distinct Digits - CodeForces
# accepted

import math, sys

input = sys.stdin.readline

def inp():
    return(int(input()))
def inlt():
    return(list(map(int,input().split())))
def insr():
    s = input()
    return(list(s[:len(s) - 1]))
def invr():
    return list(map(int,input().split()))

myin = invr()

l = myin[0]
r = myin[1]
x = l

def diff(n):
    ar = [0] * 10
    while n > 0:
        digit = math.floor(n % 10)
        if (ar[digit]):
            return 0
        ar[digit] = 1
        n = int(n / 10)
    return 1

for i in range(r - l + 1):
    n = l + i
    if diff(n):
        print(n)
        sys.exit()
        break

print("-1")
