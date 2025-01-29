# todos ficarão em um unico quarto
# apenas uma entrada para extensão
# podem ligar uma regua a outra

regua1, regua2, regua3, regua4 = map(int, input().split())

if (regua1 < 2) or (regua1 > 6):
    raise Exception('Quantidade invalida')
elif (regua2 < 2) or (regua2 > 6):
    raise Exception('Quantidade invalida')
elif (regua3 < 2) or (regua3 > 6):
    raise Exception('Quantidade invalida')
elif (regua4 < 2) or (regua4 > 6):
    raise Exception('Quantidade invalida')
else:
    qtdMaximaAparelhos = (regua1 - 1) + (regua2 - 1) + (regua3 - 1) + (regua4) 
    print(qtdMaximaAparelhos)