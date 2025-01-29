# Soma das idades dos tres filhos == idade dela
# imprimir idade do mais velho dadas a idade dela e dos outros dois filhos

def getLastChildAge(motherAge: int, childAgeA: int, childAgeB: int):
    return motherAge - childAgeA - childAgeB

def getOldestChildAge(childAgeA: int, childAgeB: int, childAgeC: int):
    result = childAgeA
    if (childAgeB > childAgeA) and (childAgeB > childAgeC):
        result = childAgeB
    elif (childAgeC > childAgeA) and (childAgeC > childAgeB):
        result = childAgeC
    return result

monicaAge = int(input())
childAgeA = int(input())
childAgeB = int(input())

childAgeC = getLastChildAge(monicaAge, childAgeA, childAgeB)
print(getOldestChildAge(childAgeA, childAgeB, childAgeC))