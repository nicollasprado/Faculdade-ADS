valor = int(input())
restoValor = valor % 100

print(valor)

notas100 = valor // 100
print(f'{notas100} nota(s) de R$ 100,00' )

notas50 = restoValor // 50
print(f'{notas50} nota(s) de R$ 50,00' )

notas20 = (restoValor - (50*notas50)) // 20
print(f'{notas20} nota(s) de R$ 20,00' )

notas10 = ((restoValor - (50*notas50) - (20*notas20)) // 10)
print(f'{notas10} nota(s) de R$ 10,00' )

notas5 = ((restoValor - (50*notas50) - (20*notas20) - (10*notas10)) // 5)
print(f'{notas5} nota(s) de R$ 5,00' )

notas2 = ((restoValor - (50*notas50) - (20*notas20) - (10*notas10) - (5*notas5)) // 2)
print(f'{notas2} nota(s) de R$ 2,00' )

notas1 = ((restoValor - (50*notas50) - (20*notas20) - (10*notas10) - (5*notas5) - (2*notas2)) // 1)
print(f'{notas1} nota(s) de R$ 1,00' )