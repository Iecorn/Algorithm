from math import factorial

def solution(n):
    answer = 0
    count2 = n//2

    for two in range(count2+1):
        one = n - two*2
        div = factorial(one)*factorial(two)
        answer += factorial(one+two)//div

    return int(answer)%1234567


print(solution(2000))