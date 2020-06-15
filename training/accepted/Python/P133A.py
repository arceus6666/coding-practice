# HQ9+ - CodeForces
# accepted

import math
import sys
input = sys.stdin.readline

# For taking integer inputs


def inp():
    return int(input())
# For taking List inputs


def inlt():
    return list(map(int, input().split()))
# For taking string inputs as charlist


def insr():
    s = input()
    return list(s[:len(s) - 1])
# For taking space seperated integer variable inputs


def invr():
    return list(map(int, input().split()))


p = insr()

yes = ('H' in p) or ('Q' in p) or ('9' in p)

print('YES' if yes else 'NO')
