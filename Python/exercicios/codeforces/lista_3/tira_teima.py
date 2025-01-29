xGroundContact, yGroundContact = map(int, input().split())
halfCourt = {
    "WidthMin": 0,
    "WidthMax": 432,
    "LengthMin": 0,
    "LengthMax": 468
}

def checkWhereHit(coordX, coordY):
    localHitted = ''
    if (coordX < halfCourt["WidthMin"]) or (coordY < halfCourt['LengthMin']):
        localHitted = 'fora'
    elif (coordX > halfCourt["WidthMax"]) or (coordY > halfCourt["LengthMax"]):
        localHitted = 'fora'
    elif (coordX < halfCourt["WidthMax"]) and (coordY > halfCourt["LengthMax"]):
        localHitted = 'fora'
    elif (coordX > halfCourt["WidthMax"]) and (coordY < halfCourt["LengthMax"]):
        localHitted = 'fora'
    elif (coordX <= halfCourt["WidthMax"]) and (coordY <= halfCourt["LengthMax"]):
        localHitted = 'dentro'
    else:
        raise Exception('Unknown hitted location')
    return localHitted

print(checkWhereHit(xGroundContact, yGroundContact))