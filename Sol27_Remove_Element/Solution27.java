import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = sol.removeElement(nums, val);

        System.out.println("Output: " + k);
        System.out.println("Array: " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}