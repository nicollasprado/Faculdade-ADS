def somar (valor1, valor2):
    valor1 = valor1
    valor2 = valor2
    soma = valor1 + valor2
    return soma

x = int(input('Digite o primeiro valor '))
y = int(input('Digite o segundo valor '))

print(somar(x, y))



lista = ['Pedro', 'Joao', 'Luiz']
lista_organizada = []

def add_na_lista(nomes):
    for nome in nomes:
        lista_organizada.append(nome)
    lista_organizada.sort()

add_na_lista(lista)
print('Lista:', lista)
print('Lista Organiada:', lista_organizada)



Lista_times = ['vasco', 'flamengo', 'gremio', 'atletico', 'goias']

def mostrar_times(times):
    for time in times:
        print(time)
        times.pop()

mostrar_times(Lista_times[:])
print(Lista_times)