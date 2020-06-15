# Brain's Photos - CodeForces
# accepted

import math, sys
input = sys.stdin.readline

# For taking integer inputs
def inp():
    return int(input())
# For taking List inputs
def inlt():
    return list(map(int, input().split()))
# For taking string inputs
def insr():
    s = input()
    return list(s[:len(s) - 1])
# For taking space seperated integer variable inputs
def invr():
    return list(map(int, input().split()))

nm = invr()
n = nm[0]

for i in range(n):
    l = insr()
    if ('C' in l) or ('M' in l) or ('Y' in l):
        print("#Color")
        sys.exit()
print("#Black&White")
