import java.util.Arrays;

class MaxProductFinder {
    public static void main(String[] args) {
        int[] nums = { 2, 3, -4, 6, 0, -2, 5 };
        System.out.println("Max product --> " + Arrays.toString(findMaxProduct(nums)));
    }

    // Method to find the maximum product of two integers in an array
    private static int[] findMaxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > max1) {
                max2 = max1;
                max1 = nums[j];
            } else if (nums[j] > max2) {
                max2 = nums[j];
            }
        }
        return new int[] { max1, max2 };
    }
}