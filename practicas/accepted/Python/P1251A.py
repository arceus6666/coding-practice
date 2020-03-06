# Broken Keyboard - codeforces
# accepted

import math, sys
input = sys.stdin.readline

# For taking integer inputs
def inp():
    return int(input())
# For taking List inputs
def inlt():
    return list(map(int, input().split()))
# For taking string inputs
def insr():
    s = input()
    return list(s[:len(s) - 1])
# For taking space seperated integer variable inputs
def invr():
    return list(map(int, input().split()))

t = inp()

while t > 0:
    t -= 1
    s = insr()
    if len(s) == 1:
        print(s[0])
    else:
        count = []
        i = 0
        while i < len(s):
        # for i in range(0, len(s)):
            # print(i)
            if i + 1 == len(s) and i < len(s):
                if not s[i] in count: 
                    count.append(s[i])
                break
            # print(s[i], s[i+1])
            if s[i] == s[i + 1]:
                i += 1
            else:
                # print(count,s[i])
                if not s[i] in count: 
                    count.append(s[i])
            i += 1
        count.sort()
        print("".join(count))
    # print("------------------------")