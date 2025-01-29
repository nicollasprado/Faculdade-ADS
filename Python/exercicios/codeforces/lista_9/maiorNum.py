def getMonoAlgarismNum(num):
    if(num < 10):
        return num
    res = 0
    strNum = str(num)
    while(len(strNum) > 1):
        if(res != 0):
            res = 0
        for digit in strNum:
            res += int(digit)
        strNum = str(res)
    return res

results = []
while True:
    numA, numB = map(int, input().split())
    if(numA == 0 and numB == 0):
        break
    numAres = getMonoAlgarismNum(numA)
    numBres = getMonoAlgarismNum(numB)
    higher = 0
    if(numBres > numAres):
        higher = 2
    elif(numAres > numBres):
        higher = 1
    results.append(higher)
    
for result in results:
    print(result)