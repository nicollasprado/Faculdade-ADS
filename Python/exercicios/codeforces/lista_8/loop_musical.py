def getPeaks(amplitudes: list):
    amplitudeIterations = []
    peaksCounter = 0
    nextIndex = 1
    for amplitude in amplitudes:
        if(nextIndex > len(amplitudes)-1):
            nextIndex = 0
        if(amplitude > amplitudes[nextIndex]):
            amplitudeIterations.append("DESCIDA")
            nextIndex += 1
        elif(amplitude < amplitudes[nextIndex]):
            amplitudeIterations.append("SUBIDA")
            nextIndex += 1
        else:
            continue

    itNextIndex = 1
    for it in amplitudeIterations:
        if(itNextIndex > len(amplitudeIterations)-1):
            itNextIndex = 0

        if(it == amplitudeIterations[itNextIndex]):
            itNextIndex += 1
            continue
        else:
            itNextIndex += 1
            peaksCounter += 1
    return peaksCounter

userInput = 1
results = []
while(userInput != 0):
    qtSamples = int(input())
    userInput = qtSamples
    if(qtSamples == 0): break
    amplitudes = list(map(int, input().split()))
    results.append(getPeaks(amplitudes))

for result in results:
    print(result)