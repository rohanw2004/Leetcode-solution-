
class Solution {
    public double myPow(double x, int n) {
        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1.0;

        while (power > 0) {
            if (power % 2 == 1) {
                result *= x;
            }

            x *= x;
            power /= 2;
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Example 1:");
        System.out.println("Input: x = 2.00000, n = 10");
        System.out.println("Output: " + solution.myPow(2.00000, 10));

        System.out.println("\nExample 2:");
        System.out.println("Input: x = 2.10000, n = 3");
        System.out.println("Output: " + solution.myPow(2.10000, 3));

        System.out.println("\nExample 3:");
        System.out.println("Input: x = 2.00000, n = -2");
        System.out.println("Output: " + solution.myPow(2.00000, -2));
    }
}
