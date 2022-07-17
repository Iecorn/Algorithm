import string

def solution(n : int, t : int, m : int, p : int):
    answer = ''
    i = 0
    count = 0
    p = p-1

    if i == p:
        answer += "0"
        count += 1
    else:
        count += 1

    i += 1

    while len(answer) < t:
        num = convert(i, n)
        for j in num:
            if check(i,n, answer, t):
                break;
            if count%m == p:
                answer += j
            count += 1

        i += 1

    return answer


def check(i : int, n : int, answer : str, t : int):
    if len(answer) >= t:
        return True
    else:
        return False


def convert(num, base):
    tmp = string.digits + string.ascii_uppercase
    q, r = divmod(num, base)
    if q == 0 :
        return tmp[r]
    else :
        return convert(q, base) + tmp[r]

