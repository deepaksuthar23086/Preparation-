import java.util.ArrayList;
import java.util.List;

class MinMaxLinearSearch {
    public static void main(String[] args) {
        int[] array = { 8, 22, 4, 11, 5, 1, 22 };
        System.out.println("index list---> " + maxAndMinElementArray(array));
    }

    // Use linear search to find and return both the maximum and minimum values in
    // an array.
    private static List<Integer> maxAndMinElementArray(int arr[]) {
        List<Integer> maxAndMinValue = new ArrayList<>();
        int length = arr.length - 1;
        int min = arr[0], max = arr[0];
        for (int i = 0; i <= length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        maxAndMinValue.add(min);
        maxAndMinValue.add(max);
        return maxAndMinValue;
    }

    @Override
    public String toString() {
        return "MinMaxLinearSearch []";
    }
}
