class Veiculos():
    def __init__(self, cor, marca, ano) -> None:
        self.cor = cor
        self.marca = marca
        self.ano = ano
        self.km = 0
        self.quantidade_portas = 4
        self.tipo_veiculo = ''
    
    def descricao(self):
        print(f'DADOS DO VEICULO \n Cor: {self.cor} \n KM rodados: {self.km} \n Marca: {self.marca} \n Ano de fabricação: {self.ano} \n Quantidade de portas: {self.quantidade_portas} \n Tipo do Veiculo: {self.tipo_veiculo}')

    def definirKM(self, novo_km):
        self.km = novo_km

    def addKM(self, qtd_add_km):
        self.km += qtd_add_km

    def setQuantidadePortas(self, qtd_portas):
        self.quantidade_portas = qtd_portas

    def setTipoVeiculo(self, tipo_veiculo_set):
        self.tipo_veiculo = tipo_veiculo_set


class Motos(Veiculos):
    def __init__(self, cor, marca, ano) -> None:
        super().__init__(cor, marca, ano)
        self.tipo_veiculo = 'Moto'

    def descricao(self):
        print(f'DADOS DO VEICULO \n Cor: {self.cor} \n KM rodados: {self.km} \n Marca: {self.marca} \n Ano de fabricação: {self.ano} \n Tipo do Veiculo: {self.tipo_veiculo}')