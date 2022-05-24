from sys import stdin
from collections import deque

l = int(stdin.readline())  # 거리
ml, mk = map(int, stdin.readline().split())  # 사거리, 살상력
c = int(stdin.readline())  # 지뢰수
zombie = [int(stdin.readline()) for i in range(l)]  # 좀비체력

q = deque()

count = 0  # 큐 안에 0이 아닌 수가 있는지 카운트
ans = True  # yer or no
for i in range(min(ml, l)):  # 처음 큐 채워주기
    if len(q) == 0:
        if zombie[0] - mk <= 0:
            q.append(0)
        else:
            q.append(zombie[0])
            count += 1
    else:
        if count == 0:
            if zombie[i] - mk * (i + 1) <= 0:
                q.append(0)
            else:
                q.append(zombie[i] - mk * (i + 1))
                count += 1
        else:
            if zombie[i] - mk * (i + 1 - count) <= 0:
                q.append(0)
            else:
                q.append(zombie[i] - mk * (i + 1 - count))
                count += 1

for i in range(ml, l):  # 나머지 좀비 진행
    if q[0] == 0:
        q.popleft()
        if zombie[i] - mk * (ml - count) <= 0:
            q.append(0)
        else:
            q.append(zombie[i] - mk * (ml - count))
            count += 1
    else:
        q.popleft()
        if c > 0:
            c -= 1
        else:
            ans = False
            break
        if zombie[i] - mk * (ml - count) <= 0:
            q.append(0)
            count -= 1
        else:
            q.append(zombie[i] - mk * (ml - count))

if ans:  # 아직 살아남을 가능성이 있고
    while q:  # q를 비우면서 확인
        if q[0] == 0:
            q.popleft()
        else:
            q.popleft()
            count -= 1
            if c > 0:
                c -= 1
            else:
                ans = False
                break

if ans:
    print("YES")
else:
#     print("NO")
#
# import sys
# from collections import deque
#
# L = int(sys.stdin.readline())
# ML, MK = map(int, sys.stdin.readline().split())
# C = int(sys.stdin.readline())
# zombies = deque()
# flag = True
# Bomber = list()
# start = -ML+1
# end = 0
# Bomb =  ML -1
# shootDam = 0
# fullDam = MK*ML
#
#
# while True:
#     zombies.append(int(sys.stdin.readline()))
#     shootDam = fullDam - Bomb * MK
#     if shootDam < zombies[end]:
#         if(C < 1):
#             C -= 1
#             flag = False
#             break
#         Bomb += 1
#         Bomber.append(True)
#     if start < 0 or Bomber[start]:
#         Bomb += 1
#         Bomber.append(True)
#     if start < 0 or Bomber[start]:
#         Bomb -= 1
#     start += 1
#     end += 1
#     if end == L:
#         break
#
# print("YES" if flag else "NO")

# while sum(zombies) > 0:
#     #폭탄
#     if zombies[0] - MK > 0 and C > 0 :
#         zombies[0] = 0
#         C -= 1
#     #기관총
#     else:
#         max_idx = len(zombies) if ML > len(zombies) else ML
#         for i in range(max_idx):
#             zombies[i] = zombies[i] - MK
#
#     if zombies[0] > 0:
#         flag = False
#         print('NO')
#         break
#
#     zombies.popleft()
#
# if flag:
#     print('YES')