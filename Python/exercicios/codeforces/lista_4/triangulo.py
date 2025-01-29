def checkIndexOutRange(nextIndex, nextNextIndex):
    if (nextIndex > 4) or (nextNextIndex > 5):
        return "Finalizar"

def checkIndexes(nextIndex, nextNextIndex):
    if (nextIndex == 4):
        nextIndex = 0
    if (nextNextIndex == 4):
        nextNextIndex = 0
    if (nextNextIndex == 5):
        nextNextIndex = 1
    return nextIndex, nextNextIndex


def possoFormarTriangulo(varetas: list):
    resultado = 'N'
    index = 1
    for vareta in varetas:
        nextIndex = index + 1
        nextNextIndex = index + 2
        nextIndex, nextNextIndex = checkIndexes(nextIndex, nextNextIndex)
        finalizar = checkIndexOutRange(nextIndex, nextNextIndex)
        if (finalizar == "Finalizar"):
            break
        else:
            if (vareta + varetas[index] > varetas[nextIndex]) and (vareta + varetas[nextIndex] > varetas[index]) and (varetas[index] + varetas[nextIndex] > vareta):
                resultado = 'S'
                break
            elif (vareta + varetas[index] > varetas[nextNextIndex]) and (vareta + varetas[nextNextIndex] > varetas[index]) and (varetas[index] + varetas[nextNextIndex] > vareta):
                resultado = 'S'
                break
            else:
                index += 1
                continue
    return resultado
            
    
vareta1, vareta2, vareta3, vareta4 = map(int, input().split())
varetas = [vareta1, vareta2, vareta3, vareta4]

print(possoFormarTriangulo(varetas))