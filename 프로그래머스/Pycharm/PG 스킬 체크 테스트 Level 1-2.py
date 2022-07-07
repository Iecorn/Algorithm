def solution(x : int):
    str_num = str(x)
    sum = 0
    for c in str_num:
        sum += int(c)

    return True if x % sum == 0 else False

print(solution(11))