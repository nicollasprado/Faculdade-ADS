valores = []
contador = int(0)

valor1 = float(input("Digite a primeira nota "))
contador = contador+1
valores.append(contador)
valor2 = float(input("Digite a segunda nota "))
contador = contador+1
valores.append(contador)
valor3 = float(input("Digite a terceira nota "))
contador = contador+1
valores.append(contador)
print(len(valores))

selecao = int(input("Digite '1' para media simples e '2' para media ponderada "))
if selecao == 1:
    mediasim = (valor1+valor2+valor3)/len(valores)
    print(mediasim)
    if mediasim >=6:
        print("Aluno Aprovado!")
    else:
        print("Aluno Reprovado!")
elif selecao == 2:
    peso1 = int(input("Digite o peso da primeira nota "))
    peso2 = int(input("Digite o peso da segunda nota "))
    peso3 = int(input("Digite o peso da terceira nota "))
    mediapon = (valor1*peso1 + valor2*peso2 + valor3*peso3)/(peso1+peso2+peso3)
    print(mediapon)
    if mediapon >=6:
        print("Aluno Aprovado")
    else:
        print("Aluno Reprovado!")