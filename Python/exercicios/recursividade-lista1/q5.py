def transformador_binario(n):
    if (n == 1):
        return "1"
    else:
        if(n % 2 == 0):
            return "0" + transformador_binario(n // 2)
        elif(n % 2 == 1):
            return "1" + transformador_binario(n//2)
        
def contador_bits(n):
    if(n == 0):
        return 0
    else:
        return 1 + contador_bits(n//10)

def conta_bits(n):
    numConvertidoBin = transformador_binario(n)[::-1]
    return contador_bits(int(numConvertidoBin))
    


num = 100
print(conta_bits(num))