def calcularDivisores(n, div):
    if(div == 1):
        divisores = [1]
        return divisores
    else:
        preencherLista = calcularDivisores(n, div-1)
        if(n % div == 0):
            preencherLista.append(div)
            return preencherLista
        else:
            return preencherLista
        

def checarPrimo(divisores: list, n):
    if(divisores == [1, n]):
        return True
        # return f"primo: {divisores}"
    else:
        return False
        # return f"Nao primo: {divisores}"


def primo(n):
    divisores = calcularDivisores(n, n)
    return checarPrimo(divisores, n)



# print(primo(2))