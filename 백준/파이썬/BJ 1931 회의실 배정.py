import sys
from dataclasses import dataclass


@dataclass
class room:
    start: int
    end: int


N = int(sys.stdin.readline())
arr = list()

for _ in range(N):
    s, e = map(int, sys.stdin.readline().split())
    arr.append(room(start=s, end=e))

arr = sorted(arr, key=lambda room: (room.end, room.start))

ans = end = 0
for r in arr:
    if r.start >= end:
        ans += 1
        end = r.end

print(ans)
