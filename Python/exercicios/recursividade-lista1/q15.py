def polinomio(coef, x, index):
    if(index > len(coef)-1):
        return 0
    else:
        return coef[::-1][index] * (x**index) + polinomio(coef, x, index+1)


coef = [5, 3, 4] # 5*x^2 + 3*x^1 + 4*x^0
x = 10
print(polinomio(coef, x, 0))