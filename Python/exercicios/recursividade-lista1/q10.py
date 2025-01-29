def checarOrdem(lista, index):
    if(index > len(lista)-1 or index+1 > len(lista)-1):
        return True
    if(lista[index] > lista[index+1]):
        return False
    else:
        return checarOrdem(lista, index+1)

def ordenada(lista):
    return checarOrdem(lista, 0)


print(ordenada([1, 2, 4, 3, 5]))