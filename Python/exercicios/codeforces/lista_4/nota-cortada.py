# se um dos pedaços possuir estritamente mais da metade da área da nota original, então ele vale 100 reais
lengthBill, heighBill = 160, 70
areaBill = lengthBill * heighBill
halfBill = areaBill / 2

def whoGotHundred(cuttedArea):
    # 1 == Felix, 2 == Mariza
    whoGot = 1
    if (cuttedArea == halfBill):
        whoGot = 0
    elif (halfBill > cuttedArea):
        whoGot = 2
    return whoGot

def verifyCuttedArea(baseCut, topCut):
    if (baseCut <= 0) and (topCut <= 0) or (baseCut > 160) or (topCut > 160):
        return True


baseCutPointToLeft = int(input())
topCutPointToLeft = int(input())
cuttedArea = ((baseCutPointToLeft + topCutPointToLeft) * 70) / 2

if (verifyCuttedArea(baseCutPointToLeft, topCutPointToLeft) != True):
    print(whoGotHundred(cuttedArea))
else:
    print(0)