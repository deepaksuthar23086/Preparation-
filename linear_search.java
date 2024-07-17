import java.util.ArrayList;
import java.util.List;

class LinearSearch {
    public static void main(String[] args) {
        int[] array = { 8, 22, 4, 11, 5, 1, 22 };
        System.out.println("index list---> " + linearSearch(array, 5));
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

}
