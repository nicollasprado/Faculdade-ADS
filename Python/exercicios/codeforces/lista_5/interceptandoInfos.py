def checkBits(number: list):
    result = "S"
    for number in numbers:
        if (number != 1) and (number != 0):
            result = "F"
            break
    return result


n1, n2, n3, n4, n5, n6, n7, n8 = map(int, input().split())
numbers = [n1, n2, n3, n4, n5, n6, n7, n8]

print(checkBits(numbers))