def getMedia(nums: list):
    totalSum = 0
    for num in nums:
        totalSum += num
    return totalSum/len(nums)

qtNum = int(input())
nums = list(map(int, input().split()))
average = getMedia(nums)

counterLessAverage = 0
numsLessAverage = []
counterEqualHighAverage = 0
numsEqualHighAverage = []

for num in nums:
    if(num < average):
        counterLessAverage += 1
        numsLessAverage.append(num)
    else:
        counterEqualHighAverage += 1
        numsEqualHighAverage.append(num)

print('{:.1f}'.format(average))
print(counterLessAverage, *numsLessAverage)
print(counterEqualHighAverage, *numsEqualHighAverage)