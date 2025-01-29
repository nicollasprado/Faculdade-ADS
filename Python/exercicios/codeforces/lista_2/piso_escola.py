width = int(input())
height = int(input())

tilesType_1_Extern = (width * height)
tilesType_1_Intern = (width - 1) * (height - 1)
tilesType_1_Total = tilesType_1_Extern + tilesType_1_Intern
print(tilesType_1_Total)

tilesType_2_Width = (width - 1) * 2
tilesType_2_Height = (height - 1) * 2
tilesType_2_Total = tilesType_2_Width + tilesType_2_Height
print(tilesType_2_Total)