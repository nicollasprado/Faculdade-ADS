def getBestMachineLocation(employeesFONE: int, employeesFTWO: int, employeesFTHREE: int):
    toFirstFloor = (employeesFTWO * 2) + (employeesFTHREE * 4)
    toSecondFloor = (employeesFONE * 2) + (employeesFTHREE * 2)
    toThirdFLoor = (employeesFONE * 4) + (employeesFTWO * 2)

    bestLocation = 1
    if (toSecondFloor <= toFirstFloor) and (toSecondFloor <= toThirdFLoor):
        bestLocation = 2
    elif (toThirdFLoor <= toSecondFloor) and (toThirdFLoor <= toFirstFloor):
        bestLocation = 3
    return bestLocation

def getCoffeTimeWasted(bestLocation: int, employeesFONE: int, employeesFTWO: int, employeesFTHREE: int):
    timeWasted = 0
    if (bestLocation == 1):
        timeWasted = (employeesFTWO * 2) + (employeesFTHREE * 4)
    elif (bestLocation == 2):
        timeWasted = (employeesFONE * 2) + (employeesFTHREE * 2)
    elif (bestLocation == 3):
        timeWasted = (employeesFONE * 4) + (employeesFTWO * 2)
    return timeWasted

employeesFirstFloor = int(input())
employeesSecondFloor = int(input())
employeesThirdFloor = int(input())

bestMachineLocation = getBestMachineLocation(employeesFirstFloor, employeesSecondFloor, employeesThirdFloor)

print(getCoffeTimeWasted(bestMachineLocation, employeesFirstFloor, employeesSecondFloor, employeesThirdFloor))