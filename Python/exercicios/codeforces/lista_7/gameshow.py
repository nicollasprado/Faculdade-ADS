def getEachRoundBalance(boxesContent: list):
    eachRoundBalance = []
    balance = 100
    for content in boxesContent:
        eachRoundBalance.append(balance + content)
        balance = balance + content
    return eachRoundBalance

qtBoxes = int(input())
boxesContent = []

for n in range(0, qtBoxes):
    boxesContent.append(int(input()))

eachRoundBalance = getEachRoundBalance(boxesContent)

maxBalance = 100
for balance in eachRoundBalance:
    if(balance > maxBalance):
        maxBalance = balance

print(maxBalance)