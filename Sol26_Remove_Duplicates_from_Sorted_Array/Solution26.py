class Solution:
    def removeDuplicates(self, nums):
        if not nums:
            return 0

        j = 0

        for i in range(1, len(nums)):
            if nums[j] != nums[i]:
                j += 1
                nums[j] = nums[i]

        return j + 1


# Example 1
nums1 = [1, 1, 2]

obj = Solution()
k1 = obj.removeDuplicates(nums1)

print("Example 1:")
print("Input: [1, 1, 2]")
print("Output: k =", k1)
print("Unique elements:", nums1[:k1])

print()


# Example 2
nums2 = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]

k2 = obj.removeDuplicates(nums2)

print("Example 2:")
print("Input: [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]")
print("Output: k =", k2)
print("Unique elements:", nums2[:k2])