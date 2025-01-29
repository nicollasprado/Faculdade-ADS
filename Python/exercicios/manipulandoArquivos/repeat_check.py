def userInDataBaseCheck(name):
    with open ('C:/Users/nicol/OneDrive/Documentos/Estudos ADS/Python/exercicios/manipulandoArquivos/names.txt', 'r') as dataBase:
        lines_reader = dataBase.read()
        if lines_reader.find(name) == -1:
            return False
        else:
            return True