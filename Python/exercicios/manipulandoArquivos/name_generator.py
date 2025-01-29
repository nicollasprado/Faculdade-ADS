from repeat_check import userInDataBaseCheck

txtArchive = 'C:/Users/nicol/OneDrive/Documentos/Estudos ADS/Python/exercicios/manipulandoArquivos/names.txt'

end = False
while end == False:
    option = input('ESCOLHA UMA OPÇÃO \n 1- Registrar um novo nome no banco de dados \n 2- Finalizar o processo! \n')
    if option == '1':
        name_toRegister = str(input('\n Digite o nome à ser registrado \n'))
        inCheck = userInDataBaseCheck(name_toRegister)
        if inCheck == False:
            dataBase = open(txtArchive, 'a')
            dataBase.write('\n'+name_toRegister)
            dataBase.close()
            print('\n Nome adicionado com sucesso! \n')
        elif inCheck == True:
            print('\n Esse nome já foi cadastrado \n')
            continue
    elif option == '2':
        end = True
    else:
        print('\n Opção não encontrada! \n')
        continue