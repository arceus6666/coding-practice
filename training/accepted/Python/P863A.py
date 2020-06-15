# Quasi-palindrome - CodeForces
# Status: Accepted

import math
import sys
input = sys.stdin.readline


def isPalindrome(s):
    i = 0
    l = len(s)
    # print(l)
    while i <= int(l / 2):
        # print("s:", s[i], "ss:", s[l - 1 - i], i)
        if s[i] != s[l - i - 1]:
            return 0
        i += 1
    return 1


x = "".join(reversed(input().replace('\n', ''))).lstrip('0')

# print(xx)
print("YES" if isPalindrome(x) else "NO")
