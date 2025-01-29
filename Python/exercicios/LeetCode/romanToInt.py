def romanToInt(s: str):
    romanNumbers = {
        "I": 1,
        "V": 5,
        "X": 10,
        "L": 50,
        "C": 100,
        "D": 500,
        "M": 1000
    }

    finalSum = 0

    for number in range(len(s) - 1):
        if (romanNumbers[s[number]] < romanNumbers[s[number + 1]]):
            finalSum -= romanNumbers[s[number]]
        else:
            finalSum += romanNumbers[s[number]]
    return finalSum + romanNumbers[s[-1]]

print(romanToInt("XLVIVV"))