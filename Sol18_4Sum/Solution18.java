import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {

                    long sum = (long) nums[i]
                             + nums[j]
                             + nums[left]
                             + nums[right];

                    if (sum == target) {

                        list.add(Arrays.asList(
                            nums[i],
                            nums[j],
                            nums[left],
                            nums[right]
                        ));

                        left++;
                        right--;

                        while (left < right &&
                               nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while (left < right &&
                               nums[right] == nums[right + 1]) {
                            right--;
                        }

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;

        System.out.println("Example 1");
        System.out.println("Input: nums = " + Arrays.toString(nums1));
        System.out.println("Target = " + target1);
        System.out.println("Output: " + solution.fourSum(nums1, target1));

        System.out.println();

        // Example 2
        int[] nums2 = {2, 2, 2, 2, 2};
        int target2 = 8;

        System.out.println("Example 2");
        System.out.println("Input: nums = " + Arrays.toString(nums2));
        System.out.println("Target = " + target2);
        System.out.println("Output: " + solution.fourSum(nums2, target2));
    }
}