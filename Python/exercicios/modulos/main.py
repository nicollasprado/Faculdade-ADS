import soma
from mult import Multiplicar
from sub import *

num1 = int(input('Digite o primeiro valor '))
num2 = int(input('Digite o segundo valor '))


parar = False
while parar == False:
    opcoes = int(input('Selecione sua opção \n 1 - Somar \n 2 - Subtrair \n 3 Multiplicar \n 4 - Finalizar \n'))
    if opcoes == 1:
        print(soma.Somar(num1, num2))
    elif opcoes == 2:
        print(Subtrair(num1, num2))
    elif opcoes == 3:
        print(Multiplicar(num1, num2))
    elif opcoes == 4:
        print('Sistema Finalizado!')
        parar = True
    else:
        print('Valor Inválido!')