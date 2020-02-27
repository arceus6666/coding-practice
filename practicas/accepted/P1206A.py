# choose Two Numbers - codeforces
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


inp()
a = invr()
inp()
b = invr()

for i in a:
    for j in b:
        n = i + j
        if not(n in a or n in b):
            print(i, j)
            sys.exit()
