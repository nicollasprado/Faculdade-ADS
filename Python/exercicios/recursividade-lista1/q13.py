def realizarInversao(lista, index):
    if(index > len(lista)-1):
        return []
    else:
        inverter = realizarInversao(lista, index+1)
        inverter.append(lista[index])
        return inverter


def inveter_lista(lista):
    return realizarInversao(lista, 0)


print(inveter_lista([1, 2, 3, 2, 5, 4]))