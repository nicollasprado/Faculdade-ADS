convidados = []

finalizar = False
while finalizar == False:
    opcoes = int(input('Escolha uma Opção: \n 1 - Adicionar Convidado \n 2 - Ver Lista de Convidados \n 3 - Remover Convidado \n 4 - Finalizar \n'))
    if opcoes == 1:
        if len(convidados) == 11:
            print('O limite (10) de convidados ja foi alcançado')
        else:
            convidado_add = str(input('Digite o nome do convidado a ser adicionado \n'))
            convidados.append(convidado_add)
            print('')
            print('{} foi adicionado com sucesso!'.format(convidado_add))
            print('')
    elif opcoes == 2:
        print('')
        print('Lista de Convidados:', sorted(convidados))
        print('')
    elif opcoes == 3:
        convidado_rmv = str(input('Digite o nome do convidado a ser excluido \n'))
        index_convidado_remover = convidados.index(convidado_rmv)
        del convidados[index_convidado_remover]
        print('')
        print('{} foi removido da lista com sucesso'.format(convidado_rmv))
        print('')
    elif opcoes == 4:
        print('')
        print('Sistema Finalizado!')
        finalizar = True
    else:
        print('Valor Inválido! \n')