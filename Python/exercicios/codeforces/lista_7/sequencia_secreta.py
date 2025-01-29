qtNumbers = int(input())

numbers = []
for n in range(0, qtNumbers):
    numbers.append(int(input()))

nextIndex = 1
counterCode = 0
for num in numbers:
    if(nextIndex > qtNumbers-1):
        counterCode += 1
    elif(num == numbers[nextIndex]):
        nextIndex += 1
    else:
        counterCode += 1
        nextIndex += 1

print(counterCode)