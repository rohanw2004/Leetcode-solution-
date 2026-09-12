class Solution:
    def strStr(self, haystack, needle):
        for i in range(len(haystack) - len(needle) + 1):
            if haystack[i:i + len(needle)] == needle:
                return i
        return -1


obj = Solution()

# Example 1
haystack1 = "sadbutsad"
needle1 = "sad"
print("Example 1 Output:", obj.strStr(haystack1, needle1))

# Example 2
haystack2 = "leetcode"
needle2 = "leeto"
print("Example 2 Output:", obj.strStr(haystack2, needle2))

# Example 3
haystack3 = "hello"
needle3 = "ll"
print("Example 3 Output:", obj.strStr(haystack3, needle3))