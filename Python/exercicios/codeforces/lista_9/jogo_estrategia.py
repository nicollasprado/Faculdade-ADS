qtPlayers, qtRounds = map(int, input().split())
pointsPerRound = list(map(int, input().split()))

playersPoints = []
while(len(playersPoints) < qtPlayers):
    playersPoints.append(0)

currentPlayerIndex = 0
for point in pointsPerRound:
    if(currentPlayerIndex > qtPlayers-1):
        currentPlayerIndex = 0
    playersPoints[currentPlayerIndex] += point
    currentPlayerIndex += 1

winnerIndex = 1
nonHighestDiff = 0
highest = playersPoints[0]
for pPoint in playersPoints[1:]:
    if(pPoint >= highest):
        highest = pPoint
        winnerIndex += 1 + nonHighestDiff
        nonHighestDiff = 0
    else:
        nonHighestDiff += 1

print(winnerIndex)