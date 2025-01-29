def getQtTroco(balance, qtBrands, brandPrices: list):
    changes = []
    for brandPrice in brandPrices:
        if(brandPrice > balance):
            changes.append(0)
        changes.append(balance - ((balance // brandPrice) * brandPrice))
    return sorted(changes)[qtBrands-1]

qtTests = int(input())

counterTests = 0
results = []
while(counterTests != qtTests):
    balance, qtBrands = map(int, input().split())
    brandsPrices = list(map(float, input().split()))
    results.append(getQtTroco(balance, qtBrands, brandsPrices))
    counterTests += 1

for result in results:
    print(f"{result:.2f}")