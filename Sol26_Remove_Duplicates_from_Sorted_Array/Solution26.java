import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        // Example 1
        int[] nums1 = {1, 1, 2};
        int k1 = obj.removeDuplicates(nums1);

        System.out.println("Example 1:");
        System.out.println("Input: [1, 1, 2]");
        System.out.println("Output: k = " + k1);
        System.out.println("Unique elements: " +
                Arrays.toString(Arrays.copyOf(nums1, k1)));

        System.out.println();

        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = obj.removeDuplicates(nums2);

        System.out.println("Example 2:");
        System.out.println("Input: [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]");
        System.out.println("Output: k = " + k2);
        System.out.println("Unique elements: " +
                Arrays.toString(Arrays.copyOf(nums2, k2)));
    }
}