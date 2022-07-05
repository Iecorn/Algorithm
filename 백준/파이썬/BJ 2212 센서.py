import sys

N = int(sys.stdin.readline())
K = int(sys.stdin.readline())
sensors = [int(i) for i in sys.stdin.readline().split(" ")]

sensors = sorted(sensors)

dist = []

if K >= N:
    print(0)
    sys.exit()

for i in range(1,N):
    dist.append(sensors[i]-sensors[i-1])

dist.sort(reverse = True)

for _ in range(K-1):
    dist.pop(0)

print(sum(dist))