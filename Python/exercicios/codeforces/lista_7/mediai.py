def getMedia(nums: list):
    totalSum = 0
    for num in nums:
        totalSum += num
    return totalSum/len(nums)

qtNum = int(input())
nums = list(map(int, input().split()))
average = getMedia(nums)

counterLessAverage = 0
counterEqualHighAverage = 0
for num in nums:
    if(num < average):
        counterLessAverage += 1
    else:
        counterEqualHighAverage += 1

print('{:.1f}'.format(average))
print(counterLessAverage)
print(counterEqualHighAverage)