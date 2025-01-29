from q8 import *


def checarListas(l1: list, l2:list):
    if(len(l1) == 0 or len(l2) == 0):
        return []
    else:
        ml1 = iterarLista(l1, 0, l1[0])
        ml2 = iterarLista(l2, 0, l2[0])

        if(l1[ml1] >= l2[ml2]):
            maiorL1 = l1.pop(iterarLista(l1, 0, l1[0]))
            maiorL2 = l2[ml2]
        elif(l2[ml2] >= l1[ml1]):
            maiorL2 = l2.pop(iterarLista(l2, 0, l2[0]))
            maiorL1 = l1[ml1]

        adicionarNaLista = checarListas(l1, l2)

        if(maiorL1 >= maiorL2):
            adicionarNaLista.append(maiorL1)
            return adicionarNaLista
        
        elif(maiorL2 >= maiorL1):
            adicionarNaLista.append(maiorL2)
            return adicionarNaLista


def junta(l1, l2):
    listasJuntasOrdenadas = checarListas(l1, l2)
    if(len(l1) == 1):
        listasJuntasOrdenadas.insert(0, l1[0])
    elif(len(l2) == 1):
        listasJuntasOrdenadas.insert(0, l2[0])
    return listasJuntasOrdenadas
    



print(junta([1, 3, 11, 13], [2, 4, 10, 12]))
print(junta([1, 4, 7, 1, 3], [9, 8, 2, 5, 1]))