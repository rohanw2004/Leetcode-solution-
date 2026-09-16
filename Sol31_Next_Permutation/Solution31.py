class Solution:
    def nextPermutation(self, nums):

        n = len(nums)
        pivot = -1

        for i in range(n - 2, -1, -1):
            if nums[i] < nums[i + 1]:
                pivot = i
                break

        if pivot == -1:
            nums.reverse()
            return

        for i in range(n - 1, pivot, -1):
            if nums[i] > nums[pivot]:
                nums[i], nums[pivot] = nums[pivot], nums[i]
                break

        nums[pivot + 1:] = reversed(nums[pivot + 1:])


# Examples
solution = Solution()

nums1 = [1, 2, 3]
solution.nextPermutation(nums1)
print("Input: [1, 2, 3]")
print("Output:", nums1)

nums2 = [3, 2, 1]
solution.nextPermutation(nums2)
print("\nInput: [3, 2, 1]")
print("Output:", nums2)

nums3 = [1, 1, 5]
solution.nextPermutation(nums3)
print("\nInput: [1, 1, 5]")
print("Output:", nums3)