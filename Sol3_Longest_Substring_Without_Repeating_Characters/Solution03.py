class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        n = len(s)
        maxLength = 0
        charIndex = [-1] * 128
        left = 0

        for right in range(n):
            if charIndex[ord(s[right])] >= left:
                left = charIndex[ord(s[right])] + 1

            charIndex[ord(s[right])] = right
            maxLength = max(maxLength, right - left + 1)

        return maxLength


# Examples
solution = Solution()

s1 = "abcabcbb"
print("Input:", s1)
print("Output:", solution.lengthOfLongestSubstring(s1))

s2 = "bbbbb"
print("\nInput:", s2)
print("Output:", solution.lengthOfLongestSubstring(s2))

s3 = "pwwkew"
print("\nInput:", s3)
print("Output:", solution.lengthOfLongestSubstring(s3))