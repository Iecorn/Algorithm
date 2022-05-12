import sys

N = int(sys.stdin.readline())
arr = [int(i) for i in sys.stdin.readline().split()]
stack = list()
cnt = 1

while len(arr) > 0:
    if cnt == arr[0]:
        cnt += 1
        arr.pop(0)
    elif len(stack) > 0 and cnt == stack[-1]:
        stack.pop()
        cnt += 1
    else:
        stack.append(arr.pop(0))

for _ in range(len(stack)):
    if cnt == stack[-1]:
        cnt += 1
        stack.pop()
    else:
        break

print("Nice" if cnt-1 == N else "Sad")
