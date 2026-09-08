class Solution:
    def removeElement(self, nums, val):
        index = 0

        for i in range(len(nums)):
            if nums[i] != val:
                nums[index] = nums[i]
                index += 1

        return index


# Example 1
nums = [3, 2, 2, 3]
val = 3

sol = Solution()
k = sol.removeElement(nums, val)

print("Output:", k)
print("Array:", nums[:k])