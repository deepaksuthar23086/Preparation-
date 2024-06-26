class IterativeBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 44, 44, 55, 66, 77, 88, 99, };
        int high = arr.length - 1, low = 0, searchElement = 44;
        iterativeBinarySearch(arr, high, low, searchElement);
    }

    private static void iterativeBinarySearch(int[] arr, int high, int low, int searchElement) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == searchElement) {
                System.out.println("Search element --> " + searchElement);
                return;
            } else if (arr[mid] < searchElement) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
