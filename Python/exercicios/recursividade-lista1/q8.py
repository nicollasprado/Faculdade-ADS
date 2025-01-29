def iterarLista(lista, index, maior):
    if((index+1) > len(lista)-1):
        return lista.index(maior)
    if(lista[index+1] >= maior):
        return iterarLista(lista, index+1, lista[index+1])
    else:
        return iterarLista(lista, index+1, maior)

def indice_do_maior(lista):
    return iterarLista(lista, 0, lista[0])


print(indice_do_maior([1000, 50000, 600, 80000, 700]))