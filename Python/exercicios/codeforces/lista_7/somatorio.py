def somatorio(num):
    numSum = 0
    for n in range(1, num+1):
        numSum += 1/n
    return numSum


numInput = int(input())
totalSum = somatorio(numInput)
print('{:.4f}'.format(totalSum))