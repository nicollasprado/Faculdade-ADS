v1, v2 = map(int, input().split())
p1, p2 = map(int, input().split())

mp = int(((v1*p1) + (v2*p2)) / (p1+p2))
print(mp)