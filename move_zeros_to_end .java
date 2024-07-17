import java.util.Arrays;

class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeros(nums);
        System.out.println("Move Zeros --> " + Arrays.toString(nums));
    }

    // Move all zeros to the end of the array.
    private static void moveZeros(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
    }
}
