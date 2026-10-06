class Solution:
    def jump(self, nums):
        jumps = 0
        current_end = 0
        farthest = 0

        for i in range(len(nums) - 1):
            farthest = max(farthest, i + nums[i])

            if i == current_end:
                jumps += 1
                current_end = farthest

        return jumps


# Examples
sol = Solution()

print("Example 1:")
nums = [2, 3, 1, 1, 4]
print("Input:", nums)
print("Output:", sol.jump(nums))

print("\nExample 2:")
nums = [2, 3, 0, 1, 4]
print("Input:", nums)
print("Output:", sol.jump(nums))