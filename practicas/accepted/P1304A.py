# Two Rabbits - codeforces
# accepted

import math, sys
input = sys.stdin.readline

# For taking integer inputs
def inp():
    return(int(input()))
# For taking List inputs
def inlt():
    return(list(map(int,input().split())))
# For taking string inputs
def insr():
    s = input()
    return(list(s[:len(s) - 1]))
# For taking space seperated integer variable inputs
def invr():
    return list(map(int,input().split()))
    
for x in range(inp()):
    n = invr()
    v = (n[1] - n[0]) / (n[2] + n[3])
    print(int(v) if v.is_integer() else "-1")
