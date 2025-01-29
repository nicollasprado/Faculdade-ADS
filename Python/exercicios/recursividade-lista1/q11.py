from q2 import *



def checarLista(lista, index):
    if(index > len(lista)-1):
        listaPrimos = []
        return listaPrimos
    else:
        adicionarLista = checarLista(lista, index+1)
        if(primo(lista[index])):
            adicionarLista.append(lista[index])
            return adicionarLista
        else:
            return checarLista(lista, index+1)

def primos(lista):
    return checarLista(lista, 0)


print(primos([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))