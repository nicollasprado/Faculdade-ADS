correctPassword = 9842

selectedPassword = 0
while(selectedPassword != correctPassword):
    selectedPassword = int(input())
    if(selectedPassword != correctPassword):
        print("Senha Invalida!")
    else:
        print("Acesso Permitido.")