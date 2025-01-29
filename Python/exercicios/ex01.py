numero1 = int(input("Digite o primeiro valor"))
numero2 = int(input("Digite o segundo valor"))
resultado = numero1//numero2
numero3 = int(input("Digite um valor par"))

while numero3 <=0:
    print("O valor tem que ser acima de 0")
    numero3 = int(input("Digite um valor par"))
    
if numero3%2 != 0:
    print("O valor é ímpar!")
else :
    resultado2 = resultado*numero3
    print("Ao dividir", numero1, "por", numero2,"obtivemos",resultado,"e, ao multiplicar por",numero3,"resultou em:",resultado2)