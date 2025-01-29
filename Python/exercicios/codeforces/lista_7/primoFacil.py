def checkPrimo(num):
    primo = "Sim"
    if(num <= 1):
        return "Nao"
    for n in range(2, num+1):
        if(n == num):
            continue
        elif(num % n == 0):
            primo = "Nao"
    return primo

num = int(input())
print(checkPrimo(num))