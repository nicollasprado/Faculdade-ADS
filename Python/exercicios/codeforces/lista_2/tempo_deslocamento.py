distancia = int(input())

if (distancia < 1) or (distancia > 1000):
    raise Exception('Distancia inválida')
else:
    velocidade = int(input())
    if (velocidade < 1) or (velocidade > 250):
        raise Exception('Velocidade inválida')
    
horas = distancia // velocidade
minutos = int(((distancia / velocidade) - horas) * 60)
horasFormatadas = '{:02d}'.format(horas)
minutosFormatados = '{:02d}'.format(minutos)

print(f"{horasFormatadas}:{minutosFormatados}")