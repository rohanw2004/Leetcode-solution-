import java.util.*;

class Solution {

    public List<String> letterCombinations(String digits) {

        // If input is empty, return empty list
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        // Phone keypad mapping
        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> ans = new ArrayList<>();

        // Start with an empty combination
        ans.add("");

        // Go through each digit
        for (int i = 0; i < digits.length(); i++) {

            // Get letters for current digit
            String let = map[digits.charAt(i) - '0'];

            List<String> temp = new ArrayList<>();

            // Take every existing combination
            for (String s : ans) {

                // Add every possible letter
                for (int j = 0; j < let.length(); j++) {
                    temp.add(s + let.charAt(j));
                }
            }

            // Move the new combinations into ans
            ans = temp;
        }

        return ans;
    }


    // =========================
    // EXAMPLE / TESTING
    // =========================

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Example 1
        String digits1 = "23";

        List<String> result1 = obj.letterCombinations(digits1);

        System.out.println("Input: " + digits1);
        System.out.println("Output: " + result1);


        // Example 2
        String digits2 = "2";

        List<String> result2 = obj.letterCombinations(digits2);

        System.out.println("\nInput: " + digits2);
        System.out.println("Output: " + result2);


        // Example 3
        String digits3 = "";

        List<String> result3 = obj.letterCombinations(digits3);

        System.out.println("\nInput: empty");
        System.out.println("Output: " + result3);
    }
}