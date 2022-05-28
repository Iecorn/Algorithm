import sys
from queue import PriorityQueue

q = PriorityQueue()
N = int(sys.stdin.readline())

for _ in range(N):
    q.put(int(sys.stdin.readline()))

answer = 0

while q.qsize() > 1:
    a = q.get()
    b = q.get()
    answer += a+b
    q.put(a+b)

print(answer)
