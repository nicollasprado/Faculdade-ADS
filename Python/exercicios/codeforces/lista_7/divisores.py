def divisores(num):
    multiples = []
    for n in range(1, num+1):
        if(num % n == 0):
            multiples.append(n)
    return multiples

num = int(input())
print(*divisores(num))