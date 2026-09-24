class Solution:
    def combinationSum(self, candidates: list[int], target: int) -> list[list[int]]:
        result = []

        def backtrack(start, current, total):
            if total == target:
                result.append(current.copy())
                return

            if total > target:
                return

            for i in range(start, len(candidates)):
                current.append(candidates[i])

                backtrack(i, current, total + candidates[i])

                current.pop()

        backtrack(0, [], 0)
        return result


# Example 1
candidates = [2, 3, 6, 7]
target = 7

solution = Solution()
print(solution.combinationSum(candidates, target))

# Output:
# [[2, 2, 3], [7]]


# Example 2
candidates = [2, 3, 5]
target = 8

solution = Solution()
print(solution.combinationSum(candidates, target))

# Output:
# [[2, 2, 2, 2], [2, 3, 3], [3, 5]]


# Example 3
candidates = [2]
target = 1

solution = Solution()
print(solution.combinationSum(candidates, target))

# Output:
# []