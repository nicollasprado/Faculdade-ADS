jumpHeight, qtPipes = map(int, input().split())
pipesHeights = list(map(int, input().split()))

previousIndex = 0
for pipe in pipesHeights[1:]:
    if((abs(pipesHeights[previousIndex] - pipe)) > jumpHeight):
        print("GAME OVER")
        break
    elif(previousIndex == qtPipes-2 and abs(pipesHeights[previousIndex] - pipe) <= jumpHeight):
        print("YOU WIN")
    else:
        previousIndex += 1