def comb(n, k):
    if(n == k):
        return 1
    elif(k == 1):
        return n
    else:
        return comb(n-1, k-1) + comb(n-1, k)
    

print(comb(6,4), comb(6,3))