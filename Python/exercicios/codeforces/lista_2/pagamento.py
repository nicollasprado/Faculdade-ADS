# ler valor de venda de um item
# ler qtd de itens a serem comprados
# entrada de qtd de dinheiro na carteira

valorItem = int(input())
qtdItens = int(input())
valorCarteira = int(input())

valorTotal = qtdItens * valorItem
if valorCarteira < valorTotal:
    valorFaltante = valorTotal - valorCarteira
    print(f"Faltam {valorFaltante} reais para efetuar a compra!")
else:
    valorTroco = valorCarteira - valorTotal
    print(f"A pagar: {valorTotal}")
    print(f"Troco  : {valorTroco}")