class Teclado():
    def __init__(self, tamanho, tipo_tecla, switch, cor, rgb) -> None:
        self.tamanho = tamanho
        self.tipo_tecla = tipo_tecla
        self.switch = switch
        self.cor = cor
        self.rgb = rgb

    def descricao(self):
        descricao = (f'DADOS DO TECLADO \n Tamanho: {self.tamanho} \n Tipo da Tecla: {self.tipo_tecla} \n Switch: {self.switch} \n Cor: {self.cor} \n RGB: {self.rgb}')
        return descricao

meu_teclado = Teclado('60%', 'Mecânica', 'Azul', 'Branco', 'Não')
print(meu_teclado.descricao())