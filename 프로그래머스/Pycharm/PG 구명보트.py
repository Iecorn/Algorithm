from typing import List
from collections import deque

def solution(people: List[int], limit:int)->int:
    people.sort(reverse=True)
    dq = deque(people)
    answer = 0

    while dq:
        if len(dq) == 1:
            answer += 1
            break
        if dq[0] + dq[-1] <= limit:
            answer += 1
            dq.pop()
            dq.popleft()
        elif dq[0] + dq[-1] > limit:
            dq.popleft()
            answer += 1

    return answer



        # if sum+people[i] <= limit:
        #     count += 1
        #     sum += people[i]
        # elif count >= 2 or sum+people[i] > limit:
        #     sum = people[i]
        #     count = 1
        #     answer += 1



people = [70, 50, 80, 50, 90, 40]
people.sort(reverse=True)
print(people)

print(solution(people, 240))
