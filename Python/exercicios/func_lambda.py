# Funciona como funções simples e anonimas (nao precisa de nome)

soma = lambda num1,num2 : num1 + num2
print(soma(2,5))

print((lambda num1, num2 : num1 * num2)(10,5))

a = lambda x,func:x+func(x)
a2 = a(2, lambda x:x*x)
print(a2)