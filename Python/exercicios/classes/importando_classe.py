from heranca import Veiculos, Motos

meu_veiculo = Veiculos('Preto', 'Honda', 2018)
meu_veiculo.definirKM(2000)
meu_veiculo.addKM(6000)
meu_veiculo.setTipoVeiculo('Carro')
meu_veiculo.descricao()

minha_moto = Motos('Vermelha', 'Yamaha', 2020)
minha_moto.definirKM(85000)
minha_moto.descricao()