from collections import defaultdict
from typing import List

class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        if not s or not words:
            return []

        word_count = defaultdict(int)
        for word in words:
            word_count[word] += 1

        substr_len = len(words) * len(words[0])
        word_len = len(words[0])
        result = []

        for i in range(len(s) - substr_len + 1):
            seen = defaultdict(int)

            for j in range(i, i + substr_len, word_len):
                word = s[j:j + word_len]

                if word in word_count:
                    seen[word] += 1

                    if seen[word] > word_count[word]:
                        break
                else:
                    break
            else:
                result.append(i)

        return result


# Examples

solution = Solution()

print("Example 1:")
s = "barfoothefoobarman"
words = ["foo", "bar"]
print("Input:", s, words)
print("Output:", solution.findSubstring(s, words))

print("\nExample 2:")
s = "wordgoodgoodgoodbestword"
words = ["word", "good", "best", "word"]
print("Input:", s, words)
print("Output:", solution.findSubstring(s, words))

print("\nExample 3:")
s = "barfoofoobarthefoobarman"
words = ["bar", "foo", "the"]
print("Input:", s, words)
print("Output:", solution.findSubstring(s, words))