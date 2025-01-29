def getTabuada(num):
    results = []
    for n in range(1, 11):
        results.append(num * n)
    return results

numInput = int(input())
results = getTabuada(numInput)

index = 0
for n in range(1, len(results)+1):
    print(f"{index+1} x {numInput} = {results[index]}")
    index += 1