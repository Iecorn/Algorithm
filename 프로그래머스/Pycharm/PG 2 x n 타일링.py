

def solution(n):
    fibo = [1,2]

    for i in range(2,n):
        fibo.append((fibo[-1]+fibo[-2])%1000000007)

    return fibo[-1]%1000000007