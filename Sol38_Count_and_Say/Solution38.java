class Solution {

    public String countAndSay(int n) {
        String result = "1";

        for (int i = 1; i < n; i++) {
            result = describe(result);
        }

        return result;
    }

    private String describe(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }

        sb.append(count).append(s.charAt(s.length() - 1));
        return sb.toString();
    }


    // LeetCode Examples

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println("Input: n = 1");
        System.out.println("Output: " + solution.countAndSay(1));

        System.out.println();

        System.out.println("Input: n = 4");
        System.out.println("Output: " + solution.countAndSay(4));
    }
}