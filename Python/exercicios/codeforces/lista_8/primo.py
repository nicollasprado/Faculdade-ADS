def getPrimoMaior(num):
    if(num < 3):
        return num+1
    divisor = 2
    testNum = num+1
    primo = False
    while(primo == False):
        if(testNum == divisor):
            break
        elif(testNum % divisor == 0):
            divisor = 2
            testNum += 1
        elif(divisor == num-1 and testNum % divisor != 0):
            return testNum
        else:
            divisor += 1

baseNum = int(input())
print(getPrimoMaior(baseNum))