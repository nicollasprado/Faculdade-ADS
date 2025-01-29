numeros = list(range(0,101,10))
print(numeros)

for numero in numeros:
    numero += 5
    print(numero)

numeros2 = []
for numero in range(5,15):
    numeros2.append(numero)
print(numeros2)
print(numeros2[5:8])