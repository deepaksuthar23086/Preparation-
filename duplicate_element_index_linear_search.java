import java.util.ArrayList;
import java.util.List;

class DuplicateElementIndexLinearSearch {
    public static void main(String[] args) {
        int[] array = { 3, 2, 5, 6, 2, 3, 6 };
        System.out.println("Total element list --> " + indexListTargetElement(array, 2));
    }

    // Modify the linear search to return a list of all indices
    // where the target element is found in the array.
    private static List<Integer> indexListTargetElement(int arr[], int searchElement) {
        List<Integer> searchElementIndexList = new ArrayList<Integer>();

        int length = arr.length - 1;
        for (int i = 0; i <= length; i++) {
            if (searchElement == arr[i]) {
                searchElementIndexList.add(i);
            }
        }
        return searchElementIndexList;
    }
}
