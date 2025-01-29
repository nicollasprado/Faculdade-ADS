Pessoa = {
    'idade': 0,
    'nome': '',
    'hobbies': [],
    'sera removido': ''
}
print(Pessoa)

print('INICIO DO CADASTRO!')
nome = str(input('Digite seu Nome '))
idade = int(input('Digite sua idade '))
fim = 0

while fim == 0:
    hobbie = str(input('Digite um hobbie '))
    Pessoa['hobbies'].append(hobbie)
    opcoes = int(input('Digite 1 para finalizar e 0 para adicionar um novo hobbie '))
    while opcoes > 1 or opcoes < 0:
        print('Digite um valor válido')
        opcoes = int(input('Digite 1 para finalizar e 0 para adicionar um novo hobbie '))
    if opcoes == 1:
        fim = 1

Pessoa['nome'] = nome
Pessoa['idade'] = idade

del Pessoa['sera removido']

print(Pessoa['nome'])
print(Pessoa['idade'])
print(Pessoa['hobbies'][1])
print(Pessoa)

for atributo, valor in Pessoa.items():
    print(atributo, valor)