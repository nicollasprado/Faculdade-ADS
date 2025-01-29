def getFinalPrice(consumption: int):
    result = 7
    if (consumption >= 30):
        result += 20
    elif (consumption in range(11, 31)):
        result += 1 * (consumption - 10)

    if (consumption >= 100):
        result += 140
    elif (consumption in range (31, 101)):
        result += 2 * (consumption - 30)

    if (consumption >= 101):
        result += 5 * (consumption - 100)
    return result

consumption = int(input())
print(getFinalPrice(consumption))