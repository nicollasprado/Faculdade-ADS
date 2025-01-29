from soma import *

while True:
    jogador1_escolha = int(input('Faça sua escolha \n 1- Par \n 2- Ímpar \n'))
    if jogador1_escolha == 1:
        jogador2_escolha = 2
        break
    elif jogador1_escolha == 2:
        jogador2_escolha = 1
        break
    else:
        print('Valor inválido!')

jogador1_numero = int(input('Digite um numero \n'))
jogador2_numero = int(input('Digite um numero \n'))
resultado = Somar(jogador1_numero, jogador2_numero)
if resultado % 2 == 0:
    print('O resultado foi {} e é um número par' .format(resultado))
    if jogador1_escolha == 1:
        print('Jogador 1 venceu!')
    elif jogador2_escolha == 1:
        print('Jogador 2 venceu!')
elif resultado % 2 != 0:
    print('O resultado foi {} e é um número ímpar' .formart(resultado))
    if jogador1_escolha == 2:
        print('Jogador 1 venceu!')
    elif jogador2_escolha == 2:
        print('Jogador 2 venceu!')