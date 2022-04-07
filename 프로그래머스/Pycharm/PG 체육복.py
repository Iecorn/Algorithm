from typing import List

def solution(n : int, lost : List[int], reserve : List[int]) -> int:
    answer = n - len(lost)
    lost.sort()
    reserve.sort()
    tmp = reserve.copy()

    for i in tmp:
        if i in lost:
            answer += 1
            lost.remove(i)
            reserve.remove(i)

    for i in lost:
        if i-1 in reserve:
            answer += 1
            reserve.remove(i-1)
        elif i+1 in reserve:
            answer += 1
            reserve.remove(i+1)

    return answer