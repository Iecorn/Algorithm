from collections import deque
import sys

n,w,L = map(int ,sys.stdin.readline().split())

wait_q = deque(map(int, sys.stdin.readline().split()))
bridge_q = deque([0]*w)
answer = 0

while wait_q:
    bridge_q.popleft()
    if sum(bridge_q) + wait_q[0] <= L:
        bridge_q.append(wait_q.popleft())
    else:
        bridge_q.append(0)
    answer += 1

while sum(bridge_q) > 0:
    bridge_q.popleft()
    answer += 1

print(answer)

