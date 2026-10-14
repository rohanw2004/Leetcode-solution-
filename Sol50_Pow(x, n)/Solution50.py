
class Solution:
    def myPow(self, x: float, n: int) -> float:
        if n < 0:
            x = 1 / x
            n = -n

        result = 1.0

        while n > 0:
            if n % 2 == 1:
                result *= x

            x *= x
            n //= 2

        return result


if __name__ == "__main__":
    solution = Solution()

    print("Example 1:")
    print("Input: x = 2.00000, n = 10")
    print("Output:", solution.myPow(2.00000, 10))

    print("\nExample 2:")
    print("Input: x = 2.10000, n = 3")
    print("Output:", solution.myPow(2.10000, 3))

    print("\nExample 3:")
    print("Input: x = 2.00000, n = -2")
    print("Output:", solution.myPow(2.00000, -2))
