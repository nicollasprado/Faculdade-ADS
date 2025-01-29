def twoSum(nums, target):
    findIndexStartValue = 0
    for val1 in nums:
        findIndexStartValue += 1
        for val2 in nums[findIndexStartValue:]:
            add_numbers = val1 + val2
            if add_numbers == target:
                return nums.index(val1), nums.index(val2, findIndexStartValue)
            else:
                continue
print(twoSum([2, 5, 5, 11], 10))