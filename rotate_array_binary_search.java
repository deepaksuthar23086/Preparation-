//To find the smallest element in a rotated sorted array, 
//you need to modify the binary search algorithm to take into account the rotation:

class RotateArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 33, 44, 55, 66, 77, 11, 22 };
        smallestRotateArrayBinarySearch(arr, 0, arr.length - 1, 11);

    }

    private static void smallestRotateArrayBinarySearch(int[] arr, int low, int high, int searchElement) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        System.out.println("search element--> " + arr[low]);
    }
}
