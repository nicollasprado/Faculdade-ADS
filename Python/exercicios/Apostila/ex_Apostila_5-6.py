# EM DESENVOLVIMENTO

estandes, delegacoes = map(int, input('Digite a quantidade de estandes construídas e de delegacoes participantes \n').split())
burles_construir, burles_destruir = map(float, input('Digite o valor, em burles, para construir e destruir estandes, respectivamente \n').split())
qtd_estandes_por_delegacao = estandes / delegacoes

if estandes < delegacoes:
    qtd_faltando = delegacoes - estandes
    valor_construcao = burles_construir * qtd_faltando
    print('O valor, em burles, para a construção de {} estandes faltantes é {} burles!'.format(qtd_faltando, valor_construcao))
elif estandes > delegacoes:
    qtd_excedente = estandes - delegacoes
    valor_destruir = burles_destruir * qtd_excedente
    qtd_para_equalizar = qtd_excedente + delegacoes
    valor_para_equalizar = qtd_para_equalizar * burles_construir
    print('O valor, em burles, para destruir {} estandes excedentes é {} burles!'.format(qtd_excedente, valor_destruir))
    print('É possível também construir {} estandes, o que custaria {} burles e assim equalizando a quantidade de estandes entre as delegacoes'.format(qtd_para_equalizar, valor_para_equalizar))
elif qtd_estandes_por_delegacao == 1:
    qtd_multiplicar = int(input('É possível aumentar a quantidade de estandes por delegacoes, atualmente temos 1 estande por delegação, insira a quantidade de vezes você quer aumentar o número de estandes por delegação \n'))
    qtd_estandes_multiplicar = (qtd_multiplicar * delegacoes) - estandes
    custo_multiplicar = qtd_estandes_multiplicar * burles_construir
    print('Para multiplicar em {}x custará {} bules!'.format(qtd_multiplicar, custo_multiplicar))
elif qtd_estandes_por_delegacao == 0:
    print('A Quantidade de estandes já está igual à de delegações')
    qtd_multiplicar = int(input('É possível aumentar a quantidade de estandes por delegacoes, atualmente temos {} estandes por delegação, insira a quantidades de vezes voce quer aumentar o número de estandes por delegação \n' .format(qtd_estandes_por_delegacao)))
    qtd_estandes_multiplicar = (qtd_multiplicar * delegacoes) - estandes
    custo_multiplicar = qtd_estandes_multiplicar * burles_construir
    print('Para multiplicar em {}x custará {} bules!'.format(qtd_multiplicar, custo_multiplicar))
elif qtd_estandes_por_delegacao > 1:
    qtd_multiplicar = int(input('É possível aumentar a quantidade de estandes por delegacoes, atualmente temos {} estandes por delegação, insira a quantidades de vezes voce quer aumentar o número de estandes por delegação \n' .format(qtd_estandes_por_delegacao)))
    qtd_estandes_multiplicar = (qtd_multiplicar * delegacoes) - estandes
    custo_multiplicar = qtd_estandes_multiplicar * burles_construir
    print('Para multiplicar em {}x custará {} bules!'.format(qtd_multiplicar, custo_multiplicar))