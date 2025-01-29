import random

class Player():
    def __init__(self, vida, dano) -> None:
        self.vida = vida
        self.dano = dano

    def atacar(self, chance_critico_min, chance_critico_max):
        chance_critico = random.randint(chance_critico_min, chance_critico_max)
        dano_critico = random.randint(6, 15)
        if chance_critico == chance_critico_max:
            print('Ataque Crítico! o alvo recebeu {} de dano!'.format(dano_critico))
        else:
            print('Ataque realizado, o alvo recebeu {} de dano!'.format(self.dano))

    def aumentarDano(self, dano_para_adicionar):
        self.dano += dano_para_adicionar
        print(f'Dano +1, dano total: {self.dano}')

    def receber_ataque(self, dano_recebido):
        self.vida -= dano_recebido
        print(f'Você recebeu dano! vida restante: {self.vida}')

player1 = Player(10, 5)
player1.atacar(1, 4) # 25% chance de critico
player1.receber_ataque(3)
player1.aumentarDano(1)