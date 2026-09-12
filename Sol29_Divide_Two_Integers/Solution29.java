class Solution {
    public int divide(int dividend, int divisor) {
        long a = dividend;
        long b = divisor;

        boolean negative = (a < 0) ^ (b < 0);

        a = Math.abs(a);
        b = Math.abs(b);

        long quotient = 0;

        while (a >= b) {
            long currentDivisor = b;
            long multiple = 1;

            while (a >= currentDivisor + currentDivisor) {
                currentDivisor += currentDivisor;
                multiple += multiple;
            }

            a -= currentDivisor;
            quotient += multiple;
        }

        if (negative) {
            quotient = -quotient;
        }

        if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) quotient;
    }
}


public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println("Example 1:");
        System.out.println("Input: dividend = 10, divisor = 3");
        System.out.println("Output: " + solution.divide(10, 3));

        System.out.println("\nExample 2:");
        System.out.println("Input: dividend = 7, divisor = -3");
        System.out.println("Output: " + solution.divide(7, -3));

        System.out.println("\nExample 3:");
        System.out.println("Input: dividend = -10, divisor = 2");
        System.out.println("Output: " + solution.divide(-10, 2));
    }
}