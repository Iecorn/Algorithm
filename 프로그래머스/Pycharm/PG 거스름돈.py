from typing import List

def solution(n: int, money: List[int]):
    rest = [1] + [0] * n

    for m in money:
        for i in range(m, n+1):
            if i >= m:
                rest[i] += rest[i-m]

    return rest[n] % 1000000007


print(solution(5, [1, 2, 5]))
