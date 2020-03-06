# Remove Adjacent - codeforces
# wrong answer

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

le = inp()
ss = insr()
s = list(map(ord, ss))
#print('len', len(s), le)

def rem(i):
    l = s[i - 1]
    r = s[i]
    cond = abs(l - r) == 1
    if l > r:
        print('taken:', chr(s[i - 1]))
        del s[i - 1]
        #del ss[i - 1]
    else:
        print('taken:', chr(s[i]))
        del s[i]
        #del ss[i]
        if len(s) > 1 and i < len(s) - 1: i += 1
print("".join(map(chr,s)))
i = le - 1
while i > -1:
    #print(i, s, ss, sep="\n")
    #print(i, end=" ")
    #print(s[i])
    l = s[i - 1]
    r = s[i]
    cond = abs(l - r) == 1
    if cond:
        if l > r:
            take = s[i - 1]
            del s[i - 1]
            print('l-taken', chr(take), 'from', chr(r), '51')
            print("".join(map(chr,s)))
            ii = i - 1
            cond2 = abs(take - s[ii - 1]) == 1
            while cond2 and ii > 0:
                #print('in while', ii)
                take = s[ii - 1]
                del s[ii - 1]
                print('l-taken', chr(take), 'from', chr(r), '59')
                print("".join(map(chr,s)))
                ii -= 1
                cond2 = abs(take - s[ii - 1]) == 1
            i = ii + 1
            #del ss[i - 1]
        else:
            print('r-taken', chr(s[i]), 'from', chr(l), i)
            del s[i]
            print("".join(map(chr,s)))
            #del ss[i]
            if len(s) > 1 and i < len(s): i += 1
    i -= 1
    #print(cond)
    #if i == 0 and len(s) > 1 and cond:
        #i += 1

print(le - len(s))