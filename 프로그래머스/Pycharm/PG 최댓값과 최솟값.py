
def solution(s : str):
    num = [int(c) for c in s.split(" ")]
    num.sort()

    print(num)

    return str(num[0])+ " " + str(num[-1])

print(solution("-1 -2 -3 -4"))