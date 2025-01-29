def sublista_sem_menor(lista):
    listWithoutMin = lista[:]

    minNumber = lista[0]

    for num in lista[1:]:
        if(minNumber > num):
            minNumber = num
        # elif(minNumber == num):
        #     listWithoutMin.remove(num)
        # Remove os repetidos ^^

    listWithoutMin.remove(minNumber)
    return listWithoutMin