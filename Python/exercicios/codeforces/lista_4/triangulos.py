def getTriangleType(sortedSticks: list):
    triangleType = ""
    calculation = (sortedSticks[0] ** 2) + (sortedSticks[1] ** 2) - (sortedSticks[2] ** 2)
    if (calculation > 0):
        # acutangulo
        triangleType = "a"
    elif (calculation == 0):
        # retangulo
        triangleType = "r"
    elif (calculation < 0):
        # obtusangulo
        triangleType = "o"
    return triangleType

def canFormTriangle(stick1, stick2, stick3):
    if (stick1 + stick2 > stick3) and (stick1 + stick3 > stick2) and (stick2 + stick3 > stick1):
        return True

stick1, stick2, stick3 = map(int, input().split())
sticks = [stick1, stick2, stick3]
sortedSticks = sorted(sticks)

boolCanForm = canFormTriangle(stick1, stick2, stick3)
if (boolCanForm == True):
    print(getTriangleType(sortedSticks))
else:
    print("n")