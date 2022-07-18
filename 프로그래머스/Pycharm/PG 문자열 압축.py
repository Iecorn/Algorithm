

def split(s : str, n : int):
    if len(s) % n == 0:
        return [s[i:i+n] for i in range(0,len(s), n)]
    else:
        arr = [s[i:i+n] for i in range(0,len(s) - 1, n)]
        arr.append(s[len(arr)*n:])
        return arr




def solution(s : str):
    answer = len(s)
    i = 1

    while i <= len(s)//2:
        tmp = ""
        arr = split(s, i)
        stack = []
        for c in arr:
            if len(stack) == 0 or stack[-1] == c:
                stack.append(c)
            elif stack[-1] != c:
                if len(stack) > 1:
                    tmp += str(len(stack)) + stack[-1]
                else:
                    tmp += stack[-1]
                stack.clear()
                stack.append(c)

        if len(stack) != 1:
            tmp += str(len(stack)) + stack[-1]
        else:
            tmp += stack[-1]
        answer = min(answer, len(tmp))


        i += 1

    return answer



print(solution("xababcdcdababcdcd"))


