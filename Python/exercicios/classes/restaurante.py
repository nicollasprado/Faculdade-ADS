import random

# Registrar Restaurante

class Restaurante():
    def __init__(self, restaurante_nome, tipo_cozinha) -> None:
        self.restaurante_nome = restaurante_nome
        self.tipo_cozinha = tipo_cozinha
    def restaurante_descricao(self):
        print('O nome do restaurante é {} e o tipo de cozinha é {}'.format(self.restaurante_nome, self.tipo_cozinha))
    def restaurante_aberto(status):
        print('O restaurante está {}'.format(status))

iniciar_desc = Restaurante(input('Digite um nome '), input('Digite o tipo de cozinha '))
iniciar_desc.restaurante_descricao()
Restaurante.restaurante_aberto('Aberto')

class Usuarios():
    def __init__(self, primeiro_nome, ultimo_nome, idade, id_usuario) -> None:
        self.primeiro_nome = primeiro_nome
        self.ultimo_nome = ultimo_nome
        self.idade = idade
        self.id_usuario = id_usuario
    def usuario_descricao(self):
        print('DADOS DO USUÁRIO \n Nome: {} \n Último nome: {} \n Idade: {} \n ID de usuario: {}'.format(self.primeiro_nome, self.ultimo_nome, self.idade, self.id_usuario))
    def usuario_saudacao(self):
        print('Olá', self.primeiro_nome)

# Registrar Usuarios

lista_ids = []

def gerarID():
    id = 0
    while len(str(id)) < 4:
        num1, num2, num3, num4 = map(int, str(random.randrange(1111, 8999, 1)))
        id = num1 * num2 * num3 * num4
    if lista_ids.count(id) == 0:
        lista_ids.append(id)
    return id

def registrarUsuario(primeiro_nome, ultimo_nome, idade, id_usuario):
    classe = Usuarios(primeiro_nome, ultimo_nome, idade, id_usuario)
    classe.usuario_saudacao()
    classe.usuario_descricao()

finalizar = False
while finalizar == False:
    escolha = int(input('ESCOLHA UMA OPÇÃO \n 1- Registrar um usuário \n 2- finalizar o sistema \n'))
    if escolha == 1:
        registrarUsuario(input('Digite o primeiro nome \n'), input('Digite o ultimo nome \n'), input('Digite a idade \n'), gerarID())
    if escolha == 2:
        finalizar = True
    else:
        print('Opção não encontrada')