

def solution(rows : int, columns : int, queries):
    answer = []
    arr = init_matrix(rows, columns)

    for x1, y1, x2, y2 in queries:
        x1 -= 1
        x2 -= 1
        y1 -= 1
        y2 -= 1

        min_arr = []
        tmp = arr[x1][y1]

        for i in range(x1, x2):
            min_arr.append(arr[i][y1])
            arr[i][y1] = arr[i+1][y1]
        for i in range(y1, y2):
            min_arr.append(arr[x2][i])
            arr[x2][i] = arr[x2][i+1]
        for i in range(x2, x1, -1):
            min_arr.append(arr[i][y2])
            arr[i][y2] = arr[i-1][y2]
        for i in range(y2, y1, -1):
            min_arr.append(arr[x1][i])
            arr[x1][i] = arr[x1][i-1]

        arr[x1][y1+1] = tmp
        answer.append(min(min_arr))


    return answer


def init_matrix(r : int, c : int):
    n = 1
    arr = [[0]*c for _ in range(r)]

    for i in range(r):
        for j in range(c):
            arr[i][j] = n
            n += 1

    return arr


print(solution(6,6, [[2,2,5,4],[3,3,6,6],[5,1,6,3]]))