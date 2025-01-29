def isPalindrome(x: int) -> bool:
    invertedNumber = ''
    numberStr = str(x)
    numberList = list(numberStr)
    print(numberList)
    aa = numberList.reverse()
    print(aa)
    for number in numberList:
        invertedNumber = number + invertedNumber
    if invertedNumber == numberStr:
        return True
    else:
        return False
    

print(isPalindrome(121))

# Easier way
# z = '2198'
# y = z[::-1]
# print(y)