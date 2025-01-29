nome = str(input())
if len(nome) > 20 or len(nome) < 3:
    raise Exception("Quantidade de caracteres inválidas, máxima: 20 e mínima: 3")
else:
    horas_trabalhadas = int(input())
    if horas_trabalhadas > 160 or horas_trabalhadas < 1:
        raise Exception("Valor de horas trabalhadas inválida, máximo: 160 e mínimo: 1")
    else:
        valor_por_hora = float(input())
        if valor_por_hora < 0.01 or valor_por_hora > 500.00:
            raise Exception("Valor de reais por hora inválida, máximo: 500 e mínimo: 0.01")
        else:
            salario = valor_por_hora * horas_trabalhadas
            salario_formatado = '{:.2f}'.format(salario)
            print(nome)
            print(f'R$ {salario_formatado}')