import itertools
import math

def is_prime_number(n):
    if n == 0 or n == 1:  # 0,1 은 소수가 아님
        return False
    else:
        for i in range(2, int(math.sqrt(n)) + 1):
            if n % i == 0:
                return False

        return True

def solution(numbers: str):
    answer = []

    for i in range(len(numbers)):
        nPr = list(set(itertools.permutations(numbers, i+1)))

        for j in range(len(nPr)):
            num = int(''.join(map(str,nPr[j])))
            if is_prime_number(num):
                answer.append(num)

    answer = list(set(answer))

    return len(answer)




print(solution("011"))