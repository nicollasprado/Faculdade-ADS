nome_vendedor = str(input())
if ' ' in nome_vendedor:
    raise Exception("Digite apenas um nome!")
else:
    salario_vendedor = float(input())
    if 0.01 > salario_vendedor or salario_vendedor > 5000:
        raise Exception("Valor de salario invalido, max: 5000 e min: 0.01")
    else:
        total_vendas_mes = float(input()) # Em dinheiro
        if 0 > total_vendas_mes or total_vendas_mes > 50000:
            raise Exception("Valor total de vendas inválido")
        else:
            print(nome_vendedor)
            total_comissao = total_vendas_mes * 0.15
            totalSalario = salario_vendedor + total_comissao
            totalSalarioFormatado = '{:.2f}'.format(totalSalario)
            print(f"R$ {totalSalarioFormatado}")