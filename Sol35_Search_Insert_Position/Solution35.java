class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] arrays = {
            {1, 3, 5, 6},
            {1, 3, 5, 6},
            {1, 3, 5, 6},
            {1, 3, 5, 6}
        };

        int[] targets = {5, 2, 7, 0};

        for (int i = 0; i < arrays.length; i++) {
            int result = solution.searchInsert(arrays[i], targets[i]);

            System.out.print("Input: [");
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]);
                if (j < arrays[i].length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println("] Target: " + targets[i]);
            System.out.println("Output: " + result);
            System.out.println();
        }
    }
}