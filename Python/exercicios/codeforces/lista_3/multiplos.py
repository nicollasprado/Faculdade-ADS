number1 = int(input())
number2 = int(input())

def higher(num1, num2):
    if (num1 > num2):
        return num1
    else:
        return num2
    
def lower(num1, num2):
    if (num1 > num2):
        return num2
    else:
        return num1

def isMultiple(higherNum, lowerNum):
    if (higherNum % lowerNum == 0):
        return 'Multiplos'
    else:
        return 'Nao multiplos'

higherNumber = higher(number1, number2)
lowerNumber = lower(number1, number2)
print(isMultiple(higherNumber, lowerNumber))