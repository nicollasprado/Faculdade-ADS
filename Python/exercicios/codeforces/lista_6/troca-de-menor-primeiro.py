def lista_troca_menor_primeiro(lista):
    oldList = lista[:]
    changedBool = 0

    minNumber = lista[0]
    for num in lista[1:]:
        if(minNumber > num):
            minNumber = num

    if(minNumber != oldList[0]):
        minNumberIndex = lista.index(minNumber)
        oldFirstValue = lista[0]

        lista.pop(minNumberIndex)
        lista.pop(0)

        lista.insert(0, minNumber)
        lista.insert(minNumberIndex, oldFirstValue)

        changedBool = 1

    return changedBool