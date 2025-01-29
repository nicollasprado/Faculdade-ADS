def checkHowMuchWillNotReceive(stockChickenMeat: int, stockBeef: int, sotckDough: int, askedChickenMeat: int, askedBeef: int, askedDough: int):
    willNotReceive = 0
    if (askedChickenMeat > stockChickenMeat):
        willNotReceive += (askedChickenMeat - stockChickenMeat)
    if (askedBeef > stockBeef):
        willNotReceive += (askedBeef - stockBeef)
    if (askedDough > sotckDough):
        willNotReceive += (askedDough - sotckDough)
    return willNotReceive

quantityChickenMeat, quantityBeef, quantityDough = map(int, input().split())
askedChickenMeat, askedBeef, askedDough = map(int, input().split())

print(checkHowMuchWillNotReceive(quantityChickenMeat, quantityBeef, quantityDough, askedChickenMeat, askedBeef, askedDough))