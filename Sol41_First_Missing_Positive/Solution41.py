class Solution(object):
    def firstMissingPositive(self, nums):
        n = len(nums)

        for i in range(n):
            while 1 <= nums[i] <= n and nums[nums[i] - 1] != nums[i]:
                nums[nums[i] - 1], nums[i] = nums[i], nums[nums[i] - 1]

        for i in range(n):
            if nums[i] != i + 1:
                return i + 1

        return n + 1


# Example 1
nums = [1, 2, 0]
print(Solution().firstMissingPositive(nums))
# Output: 3

# Example 2
nums = [3, 4, -1, 1]
print(Solution().firstMissingPositive(nums))
# Output: 2

# Example 3
nums = [7, 8, 9, 11, 12]
print(Solution().firstMissingPositive(nums))
# Output: 1