def inverterString(str, index):
    if(index > len(str)-1):
        return ""
    else:
        adicionarLetrasInversao = inverterString(str, index+1)
        return adicionarLetrasInversao + str[index]


def palindromo(str):
    stringInvertida = inverterString(str, 0)
    if(str == stringInvertida):
        return True
    else:
        return False


print(palindromo("ana"))