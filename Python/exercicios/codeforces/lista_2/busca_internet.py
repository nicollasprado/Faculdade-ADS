# t = pessoas que ja haviam clicado no link (3 link)
# pessoas que clicam no segundo link é 2x maior do que o numero de pessoas que clicam no 3 link
# pessoas que clicam no primeiro link é 2x maior que o numero de pessoas que clicam no 2 link
# return = qtd pessoas que clicam no primeiro link

qtdPessoasTerceiroLink = int(input())
qtdPessoasSegundoLink = qtdPessoasTerceiroLink * 2
qtdPessoasPrimeiroLink = qtdPessoasSegundoLink * 2

print(qtdPessoasPrimeiroLink)