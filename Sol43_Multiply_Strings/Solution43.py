class Solution:
    def multiply(self, num1, num2):
        if num1 == "0" or num2 == "0":
            return "0"

        result = [0] * (len(num1) + len(num2))

        for i in range(len(num1) - 1, -1, -1):
            for j in range(len(num2) - 1, -1, -1):
                a = ord(num1[i]) - 48
                b = ord(num2[j]) - 48

                total = a * b + result[i + j + 1]

                result[i + j + 1] = total % 10
                result[i + j] += total // 10

        while result[0] == 0:
            result.pop(0)

        return ''.join(str(x) for x in result)


# Examples
s = Solution()

print(s.multiply("2", "3"))
print(s.multiply("123", "456"))
print(s.multiply("0", "52"))