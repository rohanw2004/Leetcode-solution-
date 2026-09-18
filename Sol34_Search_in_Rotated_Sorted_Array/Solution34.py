class Solution:
    def search(self, nums, target):
        left = 0
        right = len(nums) - 1

        while left <= right:
            mid = (left + right) // 2

            if nums[mid] == target:
                return mid

            # Left half is sorted
            if nums[left] <= nums[mid]:
                if nums[left] <= target < nums[mid]:
                    right = mid - 1
                else:
                    left = mid + 1

            # Right half is sorted
            else:
                if nums[mid] < target <= nums[right]:
                    left = mid + 1
                else:
                    right = mid - 1

        return -1


# Examples
solution = Solution()

nums1 = [4, 5, 6, 7, 0, 1, 2]
target1 = 0
print("Example 1:")
print("Input: nums =", nums1, ", target =", target1)
print("Output:", solution.search(nums1, target1))

nums2 = [4, 5, 6, 7, 0, 1, 2]
target2 = 3
print("\nExample 2:")
print("Input: nums =", nums2, ", target =", target2)
print("Output:", solution.search(nums2, target2))

nums3 = [1]
target3 = 0
print("\nExample 3:")
print("Input: nums =", nums3, ", target =", target3)
print("Output:", solution.search(nums3, target3))