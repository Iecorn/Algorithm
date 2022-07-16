import sys
from collections import Counter


N = int(sys.stdin.readline())

extension = []

for _ in range(N):
    e = sys.stdin.readline().strip('\n')
    e = e[e.find(".")+1:]
    extension.append(e)

c = Counter(extension)
answer = list(c)
answer.sort()

for s in answer:
    print("%s %s" %(s, c[s]))
