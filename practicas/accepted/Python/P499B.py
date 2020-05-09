# Lecture - codeforces
# accepted

def inlt():
    return list(map(str, input().split()))

def invr():
    return list(map(int, input().split()))

nm = invr()
n = nm[0]
m = nm[1]

words = []

for i in range(m):
    words.append(inlt())

lect = inlt()

print(words)
print(lect)
