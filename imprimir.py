# easy inputs

import math, sys
input = sys.stdin.readline

# For taking integer inputs
def inp():
    return int(input())
# For taking List inputs
def inlt():
    return list(map(str, input().split()))
# For taking string inputs
def insr():
    s = input()
    return list(s[:len(s) - 1])
# For taking space seperated integer variable inputs
def invr():
    return list(map(int, input().split()))
    
# number with all distinct digits
def diff(n):
    ar = [0] * 10
    while n > 0:
        digit = math.floor(n % 10)
        if (ar[digit]):
            return 0
        ar[digit] = 1
        n = int(n / 10)
    return 1

# char to int
# chr(97) -> 'a'
# int to char
# ord('a') -> 97

# remove from array
# del arr[index]