def getMultiples(numA, numB):
    multiples = []
    for n in range(1, numB+1):
        if(n % numA == 0):
            multiples.append(n)
    return multiples

def getLessEqualMultiples(multiplesA, numB):
    results = []
    for multiple in multiplesA:
        if(multiple <= numB):
            results.append(multiple)
    return results


numA, numB = map(int, input().split())
multiplesA = getMultiples(numA, numB)
print(*getLessEqualMultiples(multiplesA, numB))