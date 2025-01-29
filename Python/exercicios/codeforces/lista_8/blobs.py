def eat(food: float):
    days = 0
    qtFood = food
    while(qtFood > 1.0):
        qtFood /= 2
        days += 1
    return days

qtTests = int(input())
foods = []

while(len(foods) != qtTests):
    foods.append(float(input()))

for food in foods:
    print(eat(food), "dias")