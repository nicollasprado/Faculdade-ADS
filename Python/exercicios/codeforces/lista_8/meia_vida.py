timeDecease, initialMass = map(int, input().split())

mass = initialMass
counterSeconds = 0

while(mass >= 0.5):
    counterSeconds += timeDecease
    mass /= 2

minutes = counterSeconds // 60
counterSeconds = counterSeconds % 60

hours = minutes // 60
minutes = minutes % 60

days = hours // 24
hours = hours % 24

hours = '{:02d}'.format(hours)
minutes = '{:02d}'.format(minutes)
totalTimeToDecease = f"{days} dias {hours}:{minutes}:{counterSeconds:02d}"
print(totalTimeToDecease)