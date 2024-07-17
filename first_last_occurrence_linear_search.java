import java.util.ArrayList;
import java.util.List;

class FirstLastOccurrenceLinearSearch {
    public static void main(String[] args) {
        int[] array = { 8, 22, 4, 11, 5, 1, 22 };
        System.out.println("index list---> " + firstLastOccurrence(array, 22));
    }

    // Implement a function to find the first and last occurrence of a
    // given target element in an array using linear search.
    private static List<Integer> firstLastOccurrence(int[] array, int element) {
        List<Integer> arr = new ArrayList<>();
        int first = -1, last = -1, length = array.length;
        for (int i = 0; i < length; i++) {
            if (element == array[i]) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        arr.add(first);
        arr.add(last);
        return arr;
    }
}
