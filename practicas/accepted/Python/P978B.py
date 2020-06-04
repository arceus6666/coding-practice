# File Name - CodeForces
# accepted

import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def insr():
    s = input()
    return list(s[:len(s) - 1])


def isSubArray(A, B, n, m):

    # Two pointers to traverse the arrays
    i = 0
    j = 0

    # Traverse both arrays simultaneously
    while (i < n and j < m):

        # If element matches
        # increment both pointers
        if (A[i] == B[j]):

            i += 1
            j += 1

            # If array B is completely
            # traversed
            if (j == m):
                return i - m

        # If not,
        # increment i and reset j
        else:
            i = i - j + 1
            j = 0

    return -1


n = inp()

s = insr()
x = ['x', 'x', 'x']

ind = isSubArray(s,x,n,3)

c = 0
while ind != -1:
    # print(ind)
    s.pop(ind)
    n -= 1
    ind = isSubArray(s,x,n,3)
    c += 1

print(c)
