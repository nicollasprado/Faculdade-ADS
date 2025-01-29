qtLetters = int(input())
text = input()

prevIndex = 0
nextIndex = 2
casesCounter = 0
itIndexesCounted = []
auxIndex = 0
for letter in text[1:]:
    if(len(text) == 2 and text.count('a') == 2):
        casesCounter = 2
        break
    if(nextIndex > len(text)-1):
        break
    itList = [text[prevIndex], letter, text[nextIndex]]
    itIndexes = [prevIndex, prevIndex+1, nextIndex]
    if(itList.count('a') > 1):
        addIndex = 0
        for it in itList:
            auxIndex = prevIndex + addIndex
            nextIndexIt = 1
            if(it == 'a' and auxIndex not in itIndexesCounted and it == itList[nextIndexIt]):
                casesCounter += 1
                itIndexesCounted.append(auxIndex)
            addIndex += 1
            nextIndexIt += 1
    prevIndex += 1
    nextIndex += 1

print(casesCounter)