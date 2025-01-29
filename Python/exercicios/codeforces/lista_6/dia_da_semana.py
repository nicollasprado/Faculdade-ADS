def dia_da_semana(h, d):
    weekDays = {
        "Domingo": 1,
        "Segunda-feira": 2,
        "Terca-feira": 3,
        "Quarta-feira": 4,
        "Quinta-feira": 5,
        "Sexta-feira": 6,
        "Sabado": 7
    }
    
    daysToEvent = d + weekDays.get(h)

    while daysToEvent > 7:
        daysToEvent = daysToEvent - 7

    arrayKeys = list(weekDays)
    return arrayKeys[daysToEvent - 1]