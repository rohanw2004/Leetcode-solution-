import java.util.HashMap;
import java.util.Map;

class Solution {

    public int romanToInt(String s) {

        Map<Character, Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = roman.get(s.charAt(i));

            int next = (i + 1 < s.length())
                    ? roman.get(s.charAt(i + 1))
                    : 0;

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Example 1
        String input1 = "III";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + solution.romanToInt(input1));

        // Example 2
        String input2 = "LVIII";
        System.out.println("\nInput: " + input2);
        System.out.println("Output: " + solution.romanToInt(input2));

        // Example 3
        String input3 = "MCMXCIV";
        System.out.println("\nInput: " + input3);
        System.out.println("Output: " + solution.romanToInt(input3));
    }
}