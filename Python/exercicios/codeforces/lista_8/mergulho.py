qtVolunteers, qtVolunteersReturned = map(int, input().split())
returnedIDs = list(map(int, input().split()))

counterIteration = 0
actualNumber = 1
diedIDs = []
while(counterIteration != qtVolunteers):
    if(actualNumber not in returnedIDs):
        diedIDs.append(actualNumber)
    actualNumber += 1
    counterIteration += 1

if(len(diedIDs) == 0):
    print("*")
else:
    print(*diedIDs, "")