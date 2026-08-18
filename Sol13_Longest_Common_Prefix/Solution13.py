from typing import List

class Solution:
    def longestCommonPrefix(self, v: List[str]) -> str:
        ans = ""
        v = sorted(v)

        first = v[0]
        last = v[-1]

        for i in range(min(len(first), len(last))):
            if first[i] != last[i]:
                return ans

            ans += first[i]

        return ans


# -------------------------------
# Examples / Test Cases
# -------------------------------

solution = Solution()

# Example 1
v = ["flower", "flow", "flight"]
print(solution.longestCommonPrefix(v))
# Output: "fl"

# Example 2
v = ["dog", "racecar", "car"]
print(solution.longestCommonPrefix(v))
# Output: ""

# Example 3
v = ["interspecies", "interstellar", "interstate"]
print(solution.longestCommonPrefix(v))
# Output: "inters"

# Example 4
v = ["apple", "app", "application"]
print(solution.longestCommonPrefix(v))
# Output: "app"

# Example 5
v = ["hello"]
print(solution.longestCommonPrefix(v))
# Output: "hello"