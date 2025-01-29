import re

texto = 'Hoje vou comer doce, hoje vou almoçar bem, hoje eu vou estudar'

identificar = re.findall('HOJE', texto.upper())
print(identificar)


procurar = re.search('HOJE', texto.upper())
print(procurar.start())
print(procurar.end())


dividir_string = re.split('\s', texto) # \s é o indicador de espaço
print(dividir_string)
print(dividir_string[2])


substituir = re.sub('\s','-', texto)
substituir = re.sub(',','.', substituir)
print(substituir)