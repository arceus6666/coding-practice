# Counting Sticks - CodeForces
# accepted

import math, sys
input = sys.stdin.readline

def insr():
    s = input()
    return list(s[:len(s) - 1])

abc = insr()
pl = abc.index('+')
eq = abc.index('=')
aa = abc[:pl]
bb = abc[pl + 1:eq]
cc = abc[eq + 1:]
a = len(aa)
b = len(bb)
c = len(cc)

if a + b == c:
    print("".join(abc))
else:
    #print(a,b,c)
    if a + b > c:
        if a + b - 1 == c + 1:
            if a > 1: cc.append(aa.pop())
            else: cc.append(bb.pop())
            print("%s+%s=%s"%("".join(aa),"".join(bb),"".join(cc)))
        else: print('Impossible')
    else:
        if a + b + 1 == c - 1:
            aa.append(cc.pop())
            print("%s+%s=%s"%("".join(aa),"".join(bb),"".join(cc)))
        else: print('Impossible')
