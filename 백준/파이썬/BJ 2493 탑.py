import sys

N = int(sys.stdin.readline())
towers = [int(i) for i in sys.stdin.readline().split()]
answer = [0]*N
stack = list()

for i in range(N):
    t = towers[i]
    while stack and towers[stack[-1]] < t:
        stack.pop()
    if stack:
        answer[i] = stack[-1] +1
    stack.append(i)

for i in answer:
    print(i)

# print(answer)


# while tops:
#     tower = tops.pop()
#
#     for i in range(len(tops)-1, -1, -1):
#         if tops[i] > tower:
#             index -= 1
#             break;
#         else:
#             answer[index] -= 1
