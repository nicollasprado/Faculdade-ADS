def maior5(a, b, c, d, e):
    higher = a
    if(b >= a and b >= c and b >= d and b >= e):
        higher = b
    elif(c >= a and c >= b and c >= d and c >= e):
        higher = c
    elif(d >= a and d >= b and d >= c and d >= e):
        higher = d
    elif(e >= a and e >= b and e >= c and e >= d):
        higher = e
    return higher