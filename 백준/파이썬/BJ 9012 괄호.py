import sys

T = int(sys.stdin.readline())
stack = list()
PS = [sys.stdin.readline().strip() for _ in range(T)]

for ps in PS:
    stack.clear()
    flag = True
    for s in ps:
        if s == '(':
            stack.append('(')
        elif s == ')' and len(stack) > 0:
            stack.pop()
        else:
            print('NO')
            flag = False
            break
    if len(stack) > 0 :
        print('NO')
    elif flag:
        print("YES")

