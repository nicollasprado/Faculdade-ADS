def testPhrasesTaut(phrase: str) -> str:
    blank = False
    taut = 'Y'
    for letter in phrase:
        if(blank == False and letter == ' '):
            blank = True
            continue
        if(blank == True and letter.upper() != phrase[0].upper()):
            taut = 'N'
            break
        blank = False
    return taut

results = []
while True:
    phrase = input()
    if(phrase == '*'):
        break
    results.append(testPhrasesTaut(phrase))
    


for result in results:
    print(result)