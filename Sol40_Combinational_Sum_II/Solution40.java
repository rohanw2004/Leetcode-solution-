import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);

        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    static void findCombinations(int ind, int[] arr, int target,
                                  List<List<Integer>> ans,
                                  List<Integer> ds) {

        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1])
                continue;

            if (arr[i] > target)
                break;

            ds.add(arr[i]);

            findCombinations(i + 1, arr, target - arr[i], ans, ds);

            ds.remove(ds.size() - 1);
        }
    }
}


public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        // Example 1
        int[] candidates1 = {10, 1, 2, 7, 6, 1, 5};
        int target1 = 8;

        System.out.println(solution.combinationSum2(candidates1, target1));


        // Example 2
        int[] candidates2 = {2, 5, 2, 1, 2};
        int target2 = 5;

        System.out.println(solution.combinationSum2(candidates2, target2));


        // Example 3
        int[] candidates3 = {2, 2, 2};
        int target3 = 4;

        System.out.println(solution.combinationSum2(candidates3, target3));
    }
}