# pode ser usada no max 3 vezes
# Cada uso = ir pro passado ou pro futuro
# tres creditos = qtd de anos pra viajar
# cada credito pode ser usado uma vez

def checkIfCanReturnPresent(timeCredits: list):
    result = "N"
    for credit in timeCredits:
        if (timeCredits.count(credit) != 1):
            result = "S"
            break
    if (result == "S"):
        return result
    elif (timeCredits[0] + timeCredits[1] == timeCredits[2]) or (timeCredits[0] + timeCredits[2] == timeCredits[1]) or (timeCredits[1] + timeCredits[2] == timeCredits[0]):
            result = "S"
    return result

creditA, creditB, creditC = map(int, input().split())
timeCredits = [creditA, creditB, creditC]

print(checkIfCanReturnPresent(timeCredits))