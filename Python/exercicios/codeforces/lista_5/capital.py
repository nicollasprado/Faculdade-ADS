# Por exemplo, se você tem quatro medidas de área A1, A2, A3 e A4, e elas são tais que A1 * A2 = A3 * A4, então é possível dividir o retângulo em dois retângulos menores usando duas linhas perpendiculares.   ---> chatgpt


#    ARRUMAR A CHECAGEM DE AREA COM NEXT AREA QUANDO TEM ENTRADA DE NUMEROS REPETIDOS



def checkIndexesOutRange(nextIndex: int, nextNextIndex: int):
    if (nextIndex == 4):
        nextIndex = 0
    if (nextIndex == 5):
        nextIndex = 1
    if (nextIndex == 6):
        nextIndex = 2

    if (nextNextIndex == 4):
        nextNextIndex = 0
    if (nextNextIndex == 5):
        nextNextIndex = 1
    if (nextNextIndex == 6):
        nextNextIndex = 2
    return nextIndex, nextNextIndex



def checkIndexesWithAreas(areaIndex: int, nextAreaIndex: int, nextIndex: int, nextNextIndex: int):
    nextIndex, nextNextIndex = checkIndexesOutRange(nextIndex, nextNextIndex)

    if (nextIndex == areaIndex):
        nextIndex += 1
    if (nextIndex == nextAreaIndex):
        nextIndex += 1

    if (nextNextIndex == areaIndex):
        nextNextIndex += 1
    if (nextNextIndex == nextAreaIndex):
        nextNextIndex += 1
        
    nextIndex, nextNextIndex = checkIndexesOutRange(nextIndex, nextNextIndex)
    return nextIndex, nextNextIndex



def incrementIndexes(nextAreaIndex: int, nextIndex: int, nextNextIndex: int):
    nextAreaIndex += 1
    if (nextAreaIndex == 4):
        nextAreaIndex = 0

    nextIndex += 1
    nextNextIndex += 1
    return nextAreaIndex, nextIndex, nextNextIndex



def checkIfCanPreserve(areas: list):
    result = "N"
    nextAreaIndex = 1
    nextIndex = 2
    nextNextIndex = 3

    for area in areas:
        nextAreaIndex = 0
        for nextArea in areas[nextAreaIndex:]:

            # print("Index NextArea=", areas.index(nextArea), "Index area=", areas.index(area))
            if (areas.index(nextArea) == areas.index(area)):
                areasChecking += 1
                nextAreaIndex, nextIndex, nextNextIndex = incrementIndexes(nextAreaIndex, nextIndex, nextNextIndex)
                continue

            else:
                nextIndex, nextNextIndex = checkIndexesWithAreas(areas.index(area), areas.index(nextArea), nextIndex, nextNextIndex)
                
                # print("area=", area, "NextArea=", nextArea, "nextIndexArea=", areas[nextIndex], "nextNextIndexArea=", areas[nextNextIndex])
                if ((area * nextArea) == (areas[nextIndex] * areas[nextNextIndex])):
                    result = "S"
                    break
                else:
                    nextAreaIndex, nextIndex, nextNextIndex = incrementIndexes(nextAreaIndex, nextIndex, nextNextIndex)
                    continue
    return result



area1, area2, area3, area4 = map(int, input().split())
areas = [area1, area2, area3, area4]


if (0 in areas):
    print("N")
elif (area1 == area2 == area3 == area4):
    print("N")
else:
    print(checkIfCanPreserve(areas))