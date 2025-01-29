def melhorMedPond(notaAv1E1, notaAv1E2, notaAv2E1, notaAv2E2, peso1, peso2):
    resultadoMediaTipo1 = ((notaAv1E1 * peso1) + (notaAv1E2 * peso2)) // (peso1 + peso2)
    resultadoMediaTipo2 = ((notaAv2E1 * peso1) + (notaAv2E2 * peso2)) // (peso1 + peso2)
    if (resultadoMediaTipo1 == resultadoMediaTipo2):
        melhorMedia = 1
    elif (resultadoMediaTipo2 > resultadoMediaTipo1):
        melhorMedia = 2
    else:
        melhorMedia = 1
    return melhorMedia
 
notaAv1E1, notaAv1E2 = map(int, input().split())
notaAv2E1, notaAv2E2 = map(int, input().split())
peso1, peso2 = map(int, input().split())
 
mediaEscolhida = melhorMedPond(notaAv1E1, notaAv1E2, notaAv2E1, notaAv2E2, peso1, peso2)
print(mediaEscolhida)