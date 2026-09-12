class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        // Example 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Example 1 Output: " + obj.strStr(haystack1, needle1));

        // Example 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("Example 2 Output: " + obj.strStr(haystack2, needle2));

        // Example 3
        String haystack3 = "hello";
        String needle3 = "ll";
        System.out.println("Example 3 Output: " + obj.strStr(haystack3, needle3));
    }
}