import java.util.Arrays;

class Solution {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // Check if this sum is closer to the target
                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }

                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        Solution solution = new Solution();
        int answer = solution.threeSumClosest(nums, target);

        System.out.println("Numbers: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Closest sum: " + answer);
    }
}