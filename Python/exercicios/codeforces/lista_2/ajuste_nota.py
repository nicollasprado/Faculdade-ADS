# n = nota maxima do prof, x = nota do aluno
N, X = map(float, input().split())

if N < 1.00 or N > 100000.00:
    raise Exception("Nota maxima inválida, máx: 100000 e min: 1")
elif X < 0 or X > N:
    raise Exception("Nota do aluno inválida")
else:
    nota_maxProf_relativa = X / N # Nota relativa
    notaIFRN = nota_maxProf_relativa * 100 # Nota na medida da Instituicao
    print(int(notaIFRN))