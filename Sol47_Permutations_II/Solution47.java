import java.util.*;

class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(int[] nums, boolean[] used,
                           List<Integer> path,
                           List<List<Integer>> ans) {

        if (path.size() == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) {
                continue;
            }

            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            used[i] = true;
            path.add(nums[i]);

            backtrack(nums, used, path, ans);

            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2};

        Solution solution = new Solution();
        List<List<Integer>> result = solution.permuteUnique(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + result);
    }
}