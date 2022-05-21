def solution(s):
    pCnt = 0
    yCnt = 0

    for c in s:
        if c == 'p' or c == 'P':
            pCnt += 1
        elif c == 'Y' or c == 'y':
            yCnt += 1

    return True if pCnt == yCnt else False