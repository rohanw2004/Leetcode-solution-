class Solution:
    def trap(self, height: list[int]) -> int:
        left = 0
        right = len(height) - 1
        left_max_wall = 0
        right_max_wall = 0
        stored_water = 0

        while left < right:
            if height[left] <= height[right]:
                if height[left] > left_max_wall:
                    left_max_wall = height[left]
                else:
                    stored_water += left_max_wall - height[left]
                left += 1
            else:
                if height[right] >= right_max_wall:
                    right_max_wall = height[right]
                else:
                    stored_water += right_max_wall - height[right]
                right -= 1

        return stored_water


sol = Solution()

print(sol.trap([0,1,0,2,1,0,1,3,2,1,2,1]))
print(sol.trap([4,2,0,3,2,5]))

# Output:
# 6
# 9