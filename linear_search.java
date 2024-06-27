import java.util.ArrayList;
import java.util.List;

class LinearSearch {
    public static void main(String[] args) {
        int[] array = { 8, 22, 4, 11, 5, 1, 22 };
        System.out.println("index list---> " + maxAndMinElementArray(array));
    }

    // Write a function to perform a linear search on an
    // array of integers and return the index of a given target element.
    private static int linearSearch(int[] arr, int searchElement) {
        int length = arr.length - 1;
        int temp = -1;
        for (int i = 0; i <= length; i++) {
            if (searchElement == arr[i]) {
                temp = i;
                System.out.println("count ---" + i);
                break;
            }
        }
        if (temp != -1) {
            return temp;
        } else {
            return -1;
        }
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

}
