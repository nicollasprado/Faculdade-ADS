def testPrimo(num: int) -> str:
    testNum = num - 1
    result = "S"
    while(testNum > 1):
        if(num % testNum == 0):
            result = "N"
            break
        else:
            testNum -= 1
    return result

qtTests = int(input())

i=0
results = []
while(i != qtTests):
    i+=1
    results.append(testPrimo(int(input())))

for result in results:
    print(result)