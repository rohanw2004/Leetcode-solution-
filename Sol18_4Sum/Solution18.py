from typing import List

class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        res = []
        nums.sort()

        for i in range(len(nums) - 3):
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            for j in range(i + 1, len(nums) - 2):
                if j > i + 1 and nums[j] == nums[j - 1]:
                    continue

                left = j + 1
                right = len(nums) - 1

                while left < right:
                    total = nums[i] + nums[j] + nums[left] + nums[right]

                    if total < target:
                        left += 1
                    elif total > target:
                        right -= 1
                    else:
                        res.append([nums[i], nums[j], nums[left], nums[right]])
                        left += 1
                        right -= 1

                        while left < right and nums[left] == nums[left - 1]:
                            left += 1

                        while left < right and nums[right] == nums[right + 1]:
                            right -= 1

        return res


# Examples

solution = Solution()

# Example 1
nums1 = [1, 0, -1, 0, -2, 2]
target1 = 0

print("Example 1")
print("Input:", nums1)
print("Target:", target1)
print("Output:", solution.fourSum(nums1, target1))

print()

# Example 2
nums2 = [2, 2, 2, 2, 2]
target2 = 8

print("Example 2")
print("Input:", nums2)
print("Target:", target2)
print("Output:", solution.fourSum(nums2, target2))