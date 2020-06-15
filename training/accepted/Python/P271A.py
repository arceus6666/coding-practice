# Beautiful Year - CodeForces
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

def diff(n):
    ar = [0] * 10
    while n > 0:
        digit = math.floor(n % 10)
        if (ar[digit]):
            return 0
        ar[digit] = 1
        n = int(n / 10)
    return 1
    
y = inp() + 1

while (not diff(y)):
    y+=1
print(y)
