class Solution:
    def countAndSay(self, n: int) -> str:
        result = "1"

        for _ in range(n - 1):
            result = self.describe(result)

        return result

    def describe(self, s: str) -> str:
        result = []
        count = 1

        for i in range(1, len(s)):
            if s[i] == s[i - 1]:
                count += 1
            else:
                result.append(f"{count}{s[i - 1]}")
                count = 1

        result.append(f"{count}{s[-1]}")
        return "".join(result)


# LeetCode Examples

solution = Solution()

print("Input: n = 1")
print("Output:", solution.countAndSay(1))

print()

print("Input: n = 4")
print("Output:", solution.countAndSay(4))