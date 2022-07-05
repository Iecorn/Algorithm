from typing import List

def solution(skill : str, skill_trees : List[str]):
    answer = 0
    index = 0


    for s in skill_trees:
        flag = True
        index = 0
        for c in s:
            if c in skill and index < len(skill) and skill[index] == c:
                index += 1
                continue;
            elif c in skill and index < len(skill) and skill[index] != c:
                flag = False
                break;
        if flag:
            answer += 1

    return answer

print(solution("CBD", ["BACDE", "CBADF", "AECB", "BDA"]))


