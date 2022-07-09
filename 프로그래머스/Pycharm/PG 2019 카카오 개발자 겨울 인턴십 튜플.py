def solution(s : str):
    answer = []
    s = s[2:len(s) - 2]
    arr = []

    for i in s.split('},{'):
        tmp = []
        for j in i.split(','):
            tmp.append(j)
        arr.append(tmp)


    arr = sorted(arr, key = len)


    for i in arr:
        for j in i:
            if int(j) not in answer:
                answer.append(int(j))

    return answer


print(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"))