import sys

N = int(sys.stdin.readline())
balloons = list(map(int, sys.stdin.readline().split()))
flag = [0]*(1000001)

for i in balloons:
    if flag[i] > 0:
        flag[i] -= 1
        flag[i-1] += 1
    else :
        flag[i-1] += 1

print(sum(flag))