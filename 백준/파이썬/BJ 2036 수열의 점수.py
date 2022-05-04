
import sys

n = int(sys.stdin.readline())

pos_num = list()
neg_num = list()
one = list()

for _ in range(n):
    tmp = int(sys.stdin.readline())
    if tmp == 1:
        one.append(1)
    elif tmp >=2 :
        pos_num.append(tmp)
    else :
        neg_num.append(tmp)

pos_num.sort()
neg_num.sort(reverse= True)

result = 0

while len(pos_num) > 0:
    if len(pos_num) >= 2:
        num1 = pos_num.pop()
        num2 = pos_num.pop()
        result = result + num1 * num2
    else:
        result += pos_num.pop()

while len(neg_num) > 0:
    if len(neg_num) >= 2:
        num1 = neg_num.pop()
        num2 = neg_num.pop()
        result = result + num1 * num2
    else:
        result += neg_num.pop()

result += sum(one)

print(result)