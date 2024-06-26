class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 44, 44, 55, 66, 77, 88, 99, };
        int high = arr.length - 1, low = 0, searchElement = 44;
        recusiveBinarySearch(arr, high, low, searchElement);
    }

    private static void recusiveBinarySearch(int[] arr, int high, int low, int searchElement) {
        int mid = (low + high) / 2;
        if (arr[mid] == searchElement) {
            System.out.println("Element----> " + searchElement);
        } else if (arr[mid] < searchElement) {
            recusiveBinarySearch(arr, high, mid + 1, searchElement);
        } else {
            recusiveBinarySearch(arr, mid - 1, low, searchElement);
        }
    }
}
