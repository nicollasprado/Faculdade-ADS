comprimentoEstrada, distanciaPedagios = map(int, input().split())
custoPorKM, custoPorPedagio = map(int, input().split())

valorPelaDistancia = comprimentoEstrada * custoPorKM
qtdPedagios = comprimentoEstrada // distanciaPedagios
custoTotalPedagio = qtdPedagios * custoPorPedagio
custoTotalViagem = valorPelaDistancia + custoTotalPedagio

print(custoTotalViagem)