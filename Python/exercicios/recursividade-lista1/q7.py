def divisores(n, k):
    if(k == 0):
        listaDivisores = [k]
        return listaDivisores
    else:
        proximoDivisor = divisores(n, k-1)
        if(n % k == 0):
            proximoDivisor.append(k)
            return proximoDivisor
        else:
            return proximoDivisor
    
def pegarListaDivisores(n):
    return divisores(n, n)


print(pegarListaDivisores(10))