import sys

N = int(sys.stdin.readline())
colors = str(sys.stdin.readline())

tmp = colors[0]
answer = int(0)

for i in range(1,N):
    if colors[i] != tmp and colors[i-1] != colors[i]:
        answer += 1

print(answer+1)
