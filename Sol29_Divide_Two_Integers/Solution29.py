class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        sign = -1 if (dividend >= 0 and divisor < 0) or (dividend < 0 and divisor >= 0) else 1

        dividend = abs(dividend)
        divisor = abs(divisor)

        result = len(range(0, dividend - divisor + 1, divisor))

        if sign == -1:
            result = -result

        minus_limit = -(2**31)
        plus_limit = 2**31 - 1

        result = min(max(result, minus_limit), plus_limit)

        return result


# Examples
solution = Solution()

print("Example 1:")
print("Input: dividend = 10, divisor = 3")
print("Output:", solution.divide(10, 3))

print("\nExample 2:")
print("Input: dividend = 7, divisor = -3")
print("Output:", solution.divide(7, -3))

print("\nExample 3:")
print("Input: dividend = -10, divisor = 2")
print("Output:", solution.divide(-10, 2))