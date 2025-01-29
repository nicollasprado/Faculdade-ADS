# precisa de um monitor na cabine

def numMinimoViagens(capacidadeCabine, alunos):
    capacidadeCabine -= 1
    viagens = alunos / capacidadeCabine
    if (alunos % capacidadeCabine != 0):
        viagens = int(viagens + 1)
    else:
        viagens = int(viagens)
    return viagens

capacidadeCabine = int(input())
totalAlunos = int(input())

print(numMinimoViagens(capacidadeCabine, totalAlunos))