def checarDivisores(num, divisor):
    if divisor == 1:
        return True
    if num % divisor == 0:
        return False
    else:
        return checarDivisores(num, divisor-1)
    
def primo(n):
    return checarDivisores(n, n-1)

print(primo(7))