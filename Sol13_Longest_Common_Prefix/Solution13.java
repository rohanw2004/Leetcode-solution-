import java.util.Arrays;

class Solution {

    public String longestCommonPrefix(String[] v) {

        StringBuilder ans = new StringBuilder();

        Arrays.sort(v);

        String first = v[0];
        String last = v[v.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {

            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }

            ans.append(first.charAt(i));
        }

        return ans.toString();
    }


    // -------------------------------
    // Examples / Test Cases
    // -------------------------------

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Example 1
        String[] v1 = {"flower", "flow", "flight"};
        System.out.println(solution.longestCommonPrefix(v1));
        // Output: "fl"


        // Example 2
        String[] v2 = {"dog", "racecar", "car"};
        System.out.println(solution.longestCommonPrefix(v2));
        // Output: ""


        // Example 3
        String[] v3 = {"interspecies", "interstellar", "interstate"};
        System.out.println(solution.longestCommonPrefix(v3));
        // Output: "inters"


        // Example 4
        String[] v4 = {"apple", "app", "application"};
        System.out.println(solution.longestCommonPrefix(v4));
        // Output: "app"


        // Example 5
        String[] v5 = {"hello"};
        System.out.println(solution.longestCommonPrefix(v5));
        // Output: "hello"
    }
}