def invalidValueCheck(value):
    if (value > 10000) or (value < 1):
        raise Exception('Invalid Value')
    else:
        return value
    
def getLowerDimension(height, width, depth):
    if (height < width) and (height < depth):
        return height
    elif (width < height) and (width < depth):
        return width
    elif (depth < height) and (depth < width):
        return depth
    else:
        return height
    
def fillInCheck(diameter, lowerDimension):
    if diameter <= lowerDimension:
        return 'S'
    else:
        return 'N'
    
ballDiameter = int(input())
invalidValueCheck(ballDiameter)

boxHeight, boxWidth, boxDepth = map(int, input().split())
dimensoes = [boxHeight, boxWidth, boxDepth]
boxHeight, boxWidth, boxDepth = map(invalidValueCheck, dimensoes)
lowerBoxDimension = getLowerDimension(boxHeight, boxWidth, boxDepth)

print(fillInCheck(ballDiameter, lowerBoxDimension))