import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def invr():
    return list(map(int, input().split()))


t = inp()

while t > 0:
    n, l, r = invr()
    if n == r or n == l:
        print("YES")
        continue

    
    

    t -= 1
