distanciaCorrer, comprimentoPista = map(int, input().split())

pontoTermino = distanciaCorrer % comprimentoPista

print(pontoTermino)