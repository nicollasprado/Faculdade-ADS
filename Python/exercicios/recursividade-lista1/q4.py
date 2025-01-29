def contadorAlgarismos(n, qtdAlg):
    if(n % 10 == 0):
        contador = 0+qtdAlg
        return contador
    else:
        return contadorAlgarismos(n//10, qtdAlg+1)


def conta_algarismos(n):
    return contadorAlgarismos(n, 0)



num = 1255312312931329
print(conta_algarismos(num))

certo = len(str(num))
print(f"certo: {certo}")