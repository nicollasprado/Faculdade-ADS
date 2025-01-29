qtRounds = int(input())

wins = 0
for i in range(0, qtRounds):
    chosenOption = int(input())
    if(chosenOption != 1):
        wins += 1

print(wins)