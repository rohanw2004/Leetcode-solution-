from typing import List

class Solution:
    def longestCommonPrefix(self, v: List[str]) -> str:
        v.sort()

        first = v[0]
        last = v[-1]

        ans = ""

        for i in range(min(len(first), len(last))):
            if first[i] != last[i]:
                break

            ans += first[i]

        return ans


# Example
v = ["flower", "flow", "flight"]

solution = Solution()
print(solution.longestCommonPrefix(v))

# Output:
# fl