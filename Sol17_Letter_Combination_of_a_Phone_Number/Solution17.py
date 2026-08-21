class Solution:
    def letterCombinations(self, digits):
        if len(digits) == 0:
            return []

        mp = [
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        ]

        ans = [""]

        for i in range(len(digits)):
            let = mp[int(digits[i])]
            temp = []

            for s in ans:
                for j in range(len(let)):
                    temp.append(s + let[j])

            ans = temp

        return ans


# Example / Testing
if __name__ == "__main__":

    solution = Solution()

    # Example 1
    digits = "23"
    result = solution.letterCombinations(digits)

    print("Input:", digits)
    print("Output:", result)

    # Example 2
    digits = "2"
    result = solution.letterCombinations(digits)

    print("\nInput:", digits)
    print("Output:", result)

    # Example 3
    digits = ""
    result = solution.letterCombinations(digits)

    print("\nInput: empty")
    print("Output:", result)