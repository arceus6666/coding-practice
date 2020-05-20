# Maximum in Table - codeforces
# accepted

import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())

'''
def pr(a):
    for e in a:
        print(e)
'''
n = inp()

a = []
for i in range(n):
    a.append([])
    for j in range(n):
        a[i].append(1)

# '''
for i in range(1, n):
    for j in range(1, n):
        u = a[:][i - 1][:][j]
        l = a[:][i][:][j - 1]
        a[i][j] = u + l
        # pr(a)
        # print()
# '''

print(a[n-1][n-1])
