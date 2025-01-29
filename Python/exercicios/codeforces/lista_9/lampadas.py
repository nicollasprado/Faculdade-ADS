def checkSwitch(switchList: list):
    switchControlIndex = 0
    for switch in switchList:
        if(switch > 1):
            switchList[switchControlIndex] = 0
        switchControlIndex += 1
    return switchList
    
 
qtChanges = int(input())
switchesClicked = list(map(int, input().split()))
 
switches = [0, 0]
for change in switchesClicked:
    switches = checkSwitch(switches)
 
    if(change == 1):
        switches[0] += 1
    elif(change == 2):
        switches[0] += 1
        switches[1] += 1
 
switches = checkSwitch(switches)
for switch in switches:
    print(switch)