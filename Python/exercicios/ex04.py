Dicionario = {
    'NORMIE': '"Normie" refere-se a pessoas que usam mídias sociais populares e acreditam na opinião popular.',
    'TAIOBA': 'Pessoa Abobalhada',
    'CONHECIMENTO VULGAR': 'Conhecimento empírico'
}

palavra = str(input('Digite uma palavra pra saber seu significado ')).upper()

teste_classe_nome = Dicionario.get(palavra)
if teste_classe_nome != None:
    print('A palavra {} significa {}'.format(palavra, teste_classe_nome))
else:
    print('Essa palavra não está registrada no dicionário!')