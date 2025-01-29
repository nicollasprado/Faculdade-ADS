# Resultando errado


def extractHighestOiliness(oiliness: list):
    highest = 0.0
    highestIndex = 0
    counterIndex = 0
    cIndexChanged = False
    for oil in oiliness:
        if(oil > highest):
            highest = oil
            if(cIndexChanged == False):
                highestIndex += 1
            highestIndex += counterIndex
            counterIndex = 0
            cIndexChanged = False
        else:
            counterIndex += 1
            cIndexChanged = True
    return highestIndex

def getPassword(oiliness: list, qtPassDigits):
    counterDigits = 0
    password = []
    oilinessCopy = oiliness.copy()
    while(counterDigits != qtPassDigits):
        actualHighestOilinessIndex = extractHighestOiliness(oilinessCopy) + counterDigits
        print(actualHighestOilinessIndex)
        password.append(actualHighestOilinessIndex)
        oilinessCopy.remove(oiliness[actualHighestOilinessIndex])
        counterDigits += 1
    return password


results = []
while(True):
    try:
        qtPassDigits = int(input())
        oiliness = list(map(float, input().split()))
        results.append(getPassword(oiliness, qtPassDigits))
    except EOFError:
        break

counterCase = 1
for result in results:
    print(f"Caso {counterCase}: ", *result, sep="")
    counterCase += 1