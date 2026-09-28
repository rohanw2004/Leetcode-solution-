class Solution(object):
    def combinationSum2(self, candidates, target):
        ans = []
        ds = []
        candidates.sort()

        def findCombination(ind, target):
            if target == 0:
                ans.append(ds[:])
                return

            for i in range(ind, len(candidates)):
                if i > ind and candidates[i] == candidates[i - 1]:
                    continue

                if candidates[i] > target:
                    break

                ds.append(candidates[i])
                findCombination(i + 1, target - candidates[i])
                ds.pop()

        findCombination(0, target)
        return ans


# Example 1
candidates = [10, 1, 2, 7, 6, 1, 5]
target = 8

solution = Solution()
print(solution.combinationSum2(candidates, target))


# Example 2
candidates = [2, 5, 2, 1, 2]
target = 5

print(solution.combinationSum2(candidates, target))


# Example 3
candidates = [2, 2, 2]
target = 4

print(solution.combinationSum2(candidates, target))