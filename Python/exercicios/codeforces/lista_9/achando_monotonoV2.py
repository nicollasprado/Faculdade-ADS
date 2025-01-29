qtLetters = int(input())
text = input()

casesCounter = 0
auxIndex = 1
for letter in text:
    if(auxIndex > len(text)-1):
        if(letter == 'a' and text[auxIndex-2] == 'a'):
            casesCounter += 1
        break
    if(letter == 'a' and auxIndex > 1):
        if((letter == 'a' and text[auxIndex] == 'a') or (letter == 'a' and text[auxIndex-2] == 'a')):
            casesCounter += 1
    elif(letter == 'a' and text[auxIndex] == 'a'):
        casesCounter += 1
    auxIndex += 1

print(casesCounter)