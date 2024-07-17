import java.util.Arrays;

class RotateArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        rotateArray(nums, 1);
        rotateArray2(nums, 1);
    }

    private static void rotateArray(int[] nums, int index) {
        int end = (nums.length - 1) - index;
        System.out.println("Before --> " + Arrays.toString(nums));
        for (int i = 0; i <= index; i++) {
            int temp = nums[i];
            nums[i] = nums[end];
            nums[end] = temp;
            ++end;
        }
        System.out.println("After --> " + Arrays.toString(nums));
    }

    private static void rotateArray2(int[] nums, int index) {
        int[] temp = new int[index + 1];
        int endIndex = nums.length - 1;
        for (int i = 0; i <= index; i++) {
            int var = nums[endIndex];
            for (int j = 0; j < nums.length; j++) {

            }
        }
        // for (int i = 0; i <= index; i++) {
        // temp[i] = nums[i];
        // }
        System.out.println("nums -> " + Arrays.toString(nums));
        System.out.println("temps -> " + Arrays.toString(temp));
    }
}
