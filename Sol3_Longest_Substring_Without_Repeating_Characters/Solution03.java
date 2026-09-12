import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }

            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String s1 = "abcabcbb";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s1));

        // Example 2
        String s2 = "bbbbb";
        System.out.println("\nInput: " + s2);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s2));

        // Example 3
        String s3 = "pwwkew";
        System.out.println("\nInput: " + s3);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s3));
    }
}