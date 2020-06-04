# Dawid and Bags of Candies - CodeForces
# accepted
import math
import sys

input = sys.stdin.readline


def inp():
    return(int(input()))


def inlt():
    return(list(map(int, input().split())))


def insr():
    s = input()
    return(list(s[:len(s) - 1]))


def invr():
    return list(map(int, input().split()))


a = invr()

b = [a[0] + a[1] == a[2] + a[3],
     a[0] + a[2] == a[1] + a[3],
     a[0] + a[3] == a[1] + a[2],
     a[0] + a[1] + a[2] == a[3],
     a[0] + a[1] + a[3] == a[2],
     a[0] + a[2] + a[3] == a[1],
     a[1] + a[2] + a[3] == a[0]]

if True in b:
    print("YES")
else:
    print("NO")
