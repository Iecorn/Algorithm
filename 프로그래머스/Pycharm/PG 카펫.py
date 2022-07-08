def solution(brown : int, yellow: int):
    answer = []
    sum = brown + yellow

    for i in range(brown, 1, -1):
        if sum % i == 0 and yellow == ((sum/i) - 2)*(i-2):
            answer.append(i)
            answer.append(int(sum/i))
            break

    return answer

print(solution(24,24))