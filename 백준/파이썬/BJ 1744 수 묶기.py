import sys

N = int(sys.stdin.readline())
neg = list()
pos = list()
zero = 0
answer = 0
remain = list()

for i in range(N):
    tmp = int(sys.stdin.readline())
    if tmp < 0:
        neg.append(tmp)
    elif tmp > 0:
        pos.append(tmp)
    else:
        zero += 1

pos.sort(reverse=True)
neg.sort()

answer = 0
i = 0

while i < len(pos):
    if len(pos)-1 == i:
        answer += pos[len(pos)-1]
        break
    elif pos[i] + pos[i+1] < pos[i]*pos[i+1]:
        answer += pos[i]*pos[i+1]
        i+=2
    else:
        answer += pos[i]
        i +=1


i = 0
while i < len(neg):
    if i == len(neg)-1:
        if zero == 0:
            answer+= neg[i]
            break
        else:
            break
    elif 0<neg[i]*neg[i+1]:
        answer += neg[i]*neg[i+1]
        i += 2

print(answer)

