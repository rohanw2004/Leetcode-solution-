import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] v) {
        Arrays.sort(v);

        String first = v[0];
        String last = v[v.length - 1];

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }

            ans.append(first.charAt(i));
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String[] v = {"flower", "flow", "flight"};

        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(v));

        // Output:
        // fl
    }
}