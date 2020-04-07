# Kanban Numbers - codeforces
# accepted
import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def isKanban(n):
    arr = [
        0,1,0,0,0,0,0,1,0,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1
    ]
    # print(len(arr))
    return arr[n]


a = inp()
print("NO" if isKanban(a) else "YES")
