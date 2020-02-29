def fixNumber(n):
    n = str(n)
    if len(n) == 1:
        return "   %s"%(n)
    elif len(n) == 2:
        return "  %s"%(n)
    else:
        return " %s"%(n)

def printM(m):
    for e in m:
        # print(" ".join(map(str,e)))
        for e2 in e:
            print(fixNumber(e2), end="")
        print("\n")

def generarMatrizCaracol(n, x = 1):
    m = []
    # print(0, m[0])
    for z in range(n):
        m.append([])
        for zz in range(n):
            m[z].append(0)
    for a in range(0, int(n / 2)):
        for i in range(a, n - a):
            # print("for1", x ,"-", a,",",i)
            m[a][i] = x
            x += 1
            # printM(m)
        for i in range(a + 1, n - a):
            # print("for2", x ,"-", i,",",n - a - 1)
            m[i][n - a - 1] = x
            x += 1
            # printM(m)
        for i in range(n - a - 2, a - 1, -1):
            # print("for3", x ,"-", n-a-1,",",i)
            m[n - a - 1][i] = x
            x += 1
            # printM(m)
        for i in range(n - a - 2, a, -1):
            # print("for4", x ,"-", i,",",a)
            m[i][a] = x
            x += 1
            # printM(m)
        # print("for0", x - 1)
        # printM(m)

    if n % 2 == 1:
        m[int(n / 2)][int(n / 2)] = x
    return m
    
n = int(input())

M = generarMatrizCaracol(n)

printM(M)