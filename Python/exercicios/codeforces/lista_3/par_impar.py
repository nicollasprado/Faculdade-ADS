number = int(input())

def parImpar(num):
    if (num % 2 == 0):
        return 'Par'
    else:
        return 'Impar'
    
print(parImpar(number))