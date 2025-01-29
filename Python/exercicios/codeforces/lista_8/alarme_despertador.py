def transformHours(hours, minutes):
    minutes = minutes + (hours*60)
    return minutes

def getTimeSleep(time: list):
    counterHours = 0
    initialHour = time[0]

    counterMinutes = 0
    initialMinutes = time[1]

    while(initialMinutes != time[3]):
        if(initialMinutes == 60):
            initialMinutes = 0
            initialHour += 1
            if(initialHour == 24):
                initialHour = 0
            continue
        initialMinutes += 1
        counterMinutes += 1

    while(initialHour != time[2]):
        if(initialHour == 24):
            initialHour = 0
            continue
        initialHour += 1
        counterHours += 1
    return transformHours(counterHours, counterMinutes)

entrada = []
resultados = []
while(entrada != [0, 0, 0, 0]):
    entrada = list(map(int, input().split()))
    if(entrada != [0, 0, 0, 0]):
        resultados.append(getTimeSleep(entrada))

for resultado in resultados:
    print(resultado)