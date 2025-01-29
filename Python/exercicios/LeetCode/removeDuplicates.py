def removeDuplicates(nums: list[int]):
    uniqueNumbers = 0
    for number in nums:
        duplicateCheck = nums.count(number)
        while (duplicateCheck > 1):
            nums.remove(number)
            duplicateCheck = nums.count(number)
        else:
            uniqueNumbers += 1
    # answer = f'{uniqueNumbers}, nums = {sorted(nums)}'
    return uniqueNumbers

numbers = [1, 2, 3, 2, 4, 2, 5]
print(removeDuplicates(numbers))