from typing import List


class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()

        closest = nums[0] + nums[1] + nums[2]

        for i in range(len(nums) - 2):
            left = i + 1
            right = len(nums) - 1

            while left < right:
                total = nums[i] + nums[left] + nums[right]

                # Check if this sum is closer to the target
                if abs(target - total) < abs(target - closest):
                    closest = total

                if total == target:
                    return target
                elif total < target:
                    left += 1
                else:
                    right -= 1

        return closest


# Example
nums = [-1, 2, 1, -4]
target = 1

solution = Solution()
answer = solution.threeSumClosest(nums, target)

print("Numbers:", nums)
print("Target:", target)
print("Closest sum:", answer)