def chosenOption(idd):
    # Codeforces max version dont support match/case

    if (idd == 1):
        price = 4.0
    elif (idd == 2):
        price = 4.5
    elif (idd == 3):
        price = 5.0
    elif (idd == 4):
        price = 2.0
    elif (idd == 5):
        price = 1.5
    return price

def priceFromOption(price, quantity):
    totalPrice = price * quantity
    totalPriceFormatted = '{:.2f}'.format(totalPrice)
    return totalPriceFormatted



identifier, itemQuantityToBuy = map(int, input().split())

if (identifier < 1) or (identifier > 5):
    raise Exception('Invalid identifier, choose from 1 to 5')

chosenPrice = chosenOption(identifier)
finalPrice = priceFromOption(chosenPrice, itemQuantityToBuy)
print(f"Total: R$ {finalPrice}")