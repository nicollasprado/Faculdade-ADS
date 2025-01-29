def decimalPlaceTestPrices(literPrice):
    if (literPrice > 10.00) or (literPrice < 0.01):
        raise Exception(f'Valor {literPrice} é inválido')
    return literPrice
    
def decimalPlaceTestPerformance(performance):
    if (performance > 20.00) or (performance < 0.01):
        raise Exception(f'Valor {performance} é inválido')
    return performance
    
def efficience(price, performance):
    return (performance / price)
    
def mostEconomical(type1Efficience, type2Efficience):
    if (type2Efficience > type1Efficience):
        return "A"
    else:
        return "G"
 
alcoolLiterPrice, gasolineLiterPrice, alcoolPerformance, gasolinePerformance = map(float, input().split())
prices = [alcoolLiterPrice, gasolineLiterPrice]
performances = [alcoolPerformance, gasolinePerformance]
alcoolLiterPrice, gasolineLiterPrice = map(decimalPlaceTestPrices, prices)
alcoolPerformance, gasolinePerformance = map(decimalPlaceTestPerformance, performances)
 
alcoolEfficience = efficience(alcoolLiterPrice, alcoolPerformance)
gasolineEfficience = efficience(gasolineLiterPrice, gasolinePerformance)
 
print(mostEconomical(gasolineEfficience, alcoolEfficience))