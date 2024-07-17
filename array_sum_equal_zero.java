class LongestSubarrayWithZeroSum {
    public static void main(String[] args) {
        int[] nums = { 1, -1, 3, 2, -2, -3, 3, 1, -4, 2 };
        System.out.println("Length of longest subarray with sum zero: " + findMaxLength(nums));
    }

    private static String findMaxLength(int[] nums) {
        String sum = "";
        int nagative = 0;
        int positive = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nagative = nagative + nums[i];
                System.out.println("i-- " + nums[i] + " --- " + nagative);
            } else {
                positive = positive + nums[i];
                System.out.println("i-- " + nums[i] + " --- " + positive);
            }
        }
        total = positive + nagative;
        System.out.println("Total---> " + (positive + nagative));
        for (int i = 0; i < nums.length; i++) {
            if (total == 0) {
                System.out.println("totle ---------------------> ");
            } else {
                total = total - nums[i];
            }
        }

        return sum;
    }
}