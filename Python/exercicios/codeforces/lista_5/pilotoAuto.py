# Acelerar se: ditancia traseira do carro de tras pra traseira dele < distancia da traseira da frente pra traseira dele

def checkSpeedUPorSpeedDown(distanceBehindCar: int, distanceActualCar: int, distanceFrontCar: int):
    # 1 = Speed UP ; -1 = Speed down ; 0 = Stay actual speed
    if ((distanceActualCar - distanceBehindCar) < (distanceFrontCar - distanceActualCar)):
        return 1
    elif ((distanceActualCar - distanceBehindCar) > (distanceFrontCar - distanceActualCar)):
        return -1
    elif ((distanceActualCar - distanceBehindCar) == (distanceFrontCar - distanceActualCar)):
        return 0

rearDistanceA = int(input())
rearDistanceB = int(input())
rearDistanceC = int(input())

print(checkSpeedUPorSpeedDown(rearDistanceA, rearDistanceB, rearDistanceC))