x, y = map(float, input().split())

def coordenadas(x, y):
    answer = ''
    if (x == 0) and (y == 0):
        answer = 'Origem'
    elif (x == 0) and (y != 0):
        answer = 'Eixo Y'
    elif (y == 0) and (x != 0):
        answer = 'Eixo X'
    elif (x > 0) and (y > 0):
        answer = 'Q1'
    elif (x < 0) and (y > 0):
        answer = 'Q2'
    elif (x < 0) and (y < 0):
        answer = 'Q3'
    elif (x > 0) and (y < 0):
        answer = 'Q4'
    return answer

print(coordenadas(x, y))