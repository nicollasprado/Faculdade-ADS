def calcular_divisores(n, div):
    if(div == 1):
        print(f"divisor encontrado: {div}" )
        return 1
    else:
        if(n % div == 0):
            print(f"divisor encontrado: {div}" )
            return 1 + calcular_divisores(n, div-1)
        else:
            return 0 + calcular_divisores(n, div-1)
        
def conta_divisores(n):
    return calcular_divisores(n, n)



print(conta_divisores(7))