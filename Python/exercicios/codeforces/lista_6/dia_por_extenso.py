def dia(dia, mes, ano):
    monthsDict = {
        1: "janeiro", 
        2: "fevereiro",
        3: "marco", 
        4: "abril", 
        5: "maio", 
        6: "junho", 
        7: "julho", 
        8: "agosto", 
        9: "setembro", 
        10: "outubro", 
        11: "novembro", 
        12: "dezembro" 
    }

    invalidDate = False
    mesTrintaDias = [4, 6, 9, 11]
    mesTrintaUmDias = [1, 3, 5, 7, 8, 10, 11]
    if(mes in mesTrintaDias and dia > 30):
        invalidDate = True
    elif(mes in mesTrintaUmDias and dia > 31):
        invalidDate = True
    elif(monthsDict.get(mes) == "fevereiro" and dia > 28):
        invalidDate = True
    if(mes > 12 or mes < 1):
        invalidDate = True

    selectedMonth = monthsDict.get(mes)
    formatedDay = '{:02d}'.format(dia)
    
    if(invalidDate):
        return "Data Invalida"
    else:
        return f"{formatedDay} de {selectedMonth} de {ano}"