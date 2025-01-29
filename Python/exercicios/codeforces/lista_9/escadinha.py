# Algum detalhe está errado

def testEscadinha(numbers: list) -> int:
    if(len(numbers) <= 2):
        return 1
    nextIndex = 2
    lastStartIndex = 0
    escadinhas = []
    changedEscadinha = False
    if(numbers[0] < 0 or numbers[1] < 0):
        lastCase = numbers[0] + numbers[1]
    else:
        lastCase = abs(numbers[0] - numbers[1])

    for num in numbers[1:]:
        if(nextIndex > len(numbers)-1):
            break
        if(num < 0 or numbers[nextIndex] < 0):
            test = num + numbers[nextIndex]
        else:
            test = abs(num - numbers[nextIndex])
        if(test != lastCase and changedEscadinha == False):
            print(test, lastCase)
            escadinhas.append(numbers[lastStartIndex:nextIndex])
            lastStartIndex = nextIndex-1
            changedEscadinha = True
        elif(test == lastCase):
            changedEscadinha = False
        lastCase = test
        nextIndex += 1
    print(escadinhas)
    return len(escadinhas)

qtNumbers = int(input())
numbers = list(map(int, input().split()))

print(testEscadinha(numbers))