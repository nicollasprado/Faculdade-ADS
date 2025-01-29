def removeElement(nums: list[int], val: int):
    while val in nums:
        nums.remove(val)
    return len(nums)

numbers = [3, 2, 2, 3]
print(removeElement(numbers, 3))