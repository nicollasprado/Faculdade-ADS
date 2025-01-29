try:
    x = 2
    print(x)
    if x < 0:
        raise Exception('Valor não permitido!')
except NameError:
    print('X nâo definido')
except:
    print('Um erro desconhecido ocorreu!')
else:
    print('Tudo certo!')
finally:
    print('Fim do tratamento!')

y = -1
if y < 0:
    raise Exception('Valor não permitido!')
else:
    print(y)