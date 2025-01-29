def ocorrencias(lista, x):
    if(x in lista):
        lista.remove(x)
        return 1 + ocorrencias(lista, x)
    else:
        return 0


print(ocorrencias([1, 2, 2, 2, 3, 4], 3))