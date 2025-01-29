# Apostila Python3 - Atividades 4.6

# Q.1
proximoFila = int(input("Digite o numero do voucher \n"))
formatacao = '{:03d}'.format(proximoFila)

print(f"Proximo da fila: {formatacao}")

# Q.2
valorAtual = float(input("Digite o valor do salário atual: \n"))
porcentagemReajuste = float(input("Digite, em %, o valor do reajuste"))

quantidade_para_adicionar = float(valorAtual * (porcentagemReajuste / 100))
novoSalario = float(valorAtual + quantidade_para_adicionar)
novoSalario = '{:.2f}'.format(novoSalario)

print(novoSalario)

# Q.3
raio = float(input("Digite o raio \n"))
pi = 3.14159
area = pi * pow(raio, 2)
area = '{:.4f}'.format(area)

print(area)

# Q.4
valorCarro = float(input("Digite o valor final de venda do carro \n"))
icms = '{:.2f}'.format(valorCarro * 18/100)
ipi = '{:.2f}'.format(valorCarro * 13/100)
pis = '{:.2f}'.format(valorCarro * 1.4/100)
cofins = '{:.2f}'.format(valorCarro * 7.6/100)
valorCarro = '{:.2f}'.format(valorCarro)
valorFinalVenda = '{:.2f}'.format(float(valorCarro) + float(ipi) + float(pis) + float(cofins))

print(f"Valor sem impostos: {valorCarro} \n ICMS: {icms} \n IPI: {ipi} \n PIS: {pis} \n Cofins: {cofins} \n Valor final: {valorFinalVenda}")