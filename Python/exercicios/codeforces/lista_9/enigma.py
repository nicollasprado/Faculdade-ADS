rawMsg = input()
decodedMsg = input()
 
floatLeft = 0
countPossibleCases = 0
 
for case in range((len(rawMsg) - len(decodedMsg))+1):
    testsCount = 0
    testIndex = 0
    possibleCase = True
    while(testsCount < len(decodedMsg)):
        if(decodedMsg[testIndex] == rawMsg[testIndex+floatLeft]):
            possibleCase = False
            break
        testIndex += 1
        testsCount += 1
 
    if(possibleCase):
        countPossibleCases += 1
 
    floatLeft += 1
 
print(countPossibleCases)