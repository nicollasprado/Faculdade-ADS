def balanceTeams(levels: list):
    teamA = levels[0] + levels[3]
    teamB = levels[1] + levels[2]
    result = teamA - teamB
    if (teamB > teamA):
        result = teamB - teamA
    return result


levelPA = int(input())
levelPB = int(input())
levelPC = int(input())
levelPD = int(input())
levels = sorted([levelPA, levelPB, levelPC, levelPD])

print(balanceTeams(levels))