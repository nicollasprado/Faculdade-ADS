def realizarSomaPares(lista, index, soma):
    if(index > len(lista)-1):
        return soma
    else:
        if(lista[index] % 2 == 0):
            return realizarSomaPares(lista, index+1, lista[index] + soma)
        else:
            return realizarSomaPares(lista, index+1, soma)

def soma_pares(lista):
    return realizarSomaPares(lista, 0, 0)


print(soma_pares([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))