number = int(input())

def SucessorPar(num):
    if (num % 2 == 0):
        sucessor = num + 2
        return sucessor
    else:
        sucessor = num + 1
        return sucessor

print(SucessorPar(number))