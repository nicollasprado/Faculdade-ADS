qtMeasurements = int(input())

measurements = []
for i in range(0, qtMeasurements):
    measurements.append(int(input()))

measuresSum = 0
for measure in measurements:
    measuresSum += measure

measureAvg = measuresSum//qtMeasurements

diffMeasureCounter = 0
for measure in measurements:
    if(measure > int(measureAvg * 1.1) or measure < int(measureAvg * 0.9)):
        diffMeasureCounter += 1

print(measureAvg)
print(diffMeasureCounter)