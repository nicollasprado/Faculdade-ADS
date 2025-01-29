camisa = [
    ['TAMANHO','M'],
    ['MARCA','ADIDAS'],
    ['MALHA','TECIDO']
]


print(camisa[0][0], camisa[0][1])
print(camisa[1][0], camisa[1][1])
print(camisa[2][0], camisa[2][1])
print('')

camisa[0][1] = 'G'
camisa.append(['COR','AZUL'])

for linha, coluna in camisa[:]:
    print(linha, coluna)