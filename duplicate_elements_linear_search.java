class DuplicateElementsLinearSearch {
    public static void main(String[] args) {
        int[] array = { 3, 2, 5, 6, 2, 3, 6 };
        System.out.println("Total count ==> " + countTargetElement(array, 2));
    }

    // Write a function to count the number of times a given target element
    // appears in an array using linear search.
    private static int countTargetElement(int arr[], int searchElement) {
        int length = arr.length - 1;
        int count = 0;
        for (int i = 0; i <= length; i++) {
            if (searchElement == arr[i]) {
                ++count;
            }
        }
        if (count != 0) {
            return count;
        } else {
            return -1;
        }
    }
}
