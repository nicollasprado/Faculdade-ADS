numCharrete, distanceToEndline, speed = map(int, input().split())
numCharrete2, distanceToEndlineC2, speedC2 = map(int, input().split())
 
timeToEndC1 = distanceToEndline / speed
timeToEndC2 = distanceToEndlineC2 / speedC2
 
if (timeToEndC1 == timeToEndC2):
    raise Exception("Caso impossivel")
elif (timeToEndC1 > timeToEndC2):
    print(numCharrete2)
else:
    print(numCharrete)