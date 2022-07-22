from itertools import permutations

def solution(k : int, dungeons):
    answer = 0
    l = len(dungeons)

    for p in permutations(dungeons, l):
        tk = k
        count = 0
        for d in p:
            if tk >= d[0]:
                tk -= d[1]
                count += 1
            answer = max(answer, count)

    return answer

print(solution(80, [[80,20],[50,40],[30,10]]))