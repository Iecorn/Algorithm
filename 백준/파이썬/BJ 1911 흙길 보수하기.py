import sys
from dataclasses import dataclass

@dataclass
class pool:
    start : int
    end : int


N, L = map(int, sys.stdin.readline().split())
pools = list()
flag = True

for _ in range(N):
    s, e = map(int, sys.stdin.readline().split())
    pools.append(pool(start = s, end= e))


pools = sorted(pools, key = lambda pool : pool.start)

location = pools[0].start
total_cnt = 0

for p in pools:
    if location < p.start:
        location = p.start

    dist = p.end - location
    reminder = 1
    if dist % L == 0:
        reminder = 0

    cnt = dist // L + reminder
    location += cnt * L
    total_cnt += cnt

if (location-L == pools[-1].end):
    total_cnt -= 1

print(total_cnt)