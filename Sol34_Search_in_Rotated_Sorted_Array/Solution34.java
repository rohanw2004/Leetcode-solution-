class Solution {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {

                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            // Right half is sorted
            } else {

                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;

        System.out.println("Example 1:");
        System.out.println("Input: nums = [4, 5, 6, 7, 0, 1, 2], target = " + target1);
        System.out.println("Output: " + solution.search(nums1, target1));


        // Example 2
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;

        System.out.println("\nExample 2:");
        System.out.println("Input: nums = [4, 5, 6, 7, 0, 1, 2], target = " + target2);
        System.out.println("Output: " + solution.search(nums2, target2));


        // Example 3
        int[] nums3 = {1};
        int target3 = 0;

        System.out.println("\nExample 3:");
        System.out.println("Input: nums = [1], target = " + target3);
        System.out.println("Output: " + solution.search(nums3, target3));
    }
}