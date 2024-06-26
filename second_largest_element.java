class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = { 88, 22, 44, 11, 55, 22 };
        // secondLargestElement(array);
        sortArray(array);
    }

    public static void secondLargestElement(int[] arr) {
        int length = arr.length;
        int largeElement = 0;
        int temp = 0;
        for (int i = 0; i <= length - 1; i++) {
            if (largeElement <= arr[i]) {
                largeElement = arr[i];
                temp = i;
            }
        }
        System.out.println("large number -->" + largeElement + "  " + temp);
    }

    private static void sortArray(int arr[]) {
        int length = arr.length;
        int[] tempArray = new int[length];
        int x = 0;
        for (int i = 0; i <= length - 1; i++) {
            int temp = arr[i];
            for (int j = 0; j <= length - 1; j++) {
                if (temp <= arr[j]) {
                    x = j;
                }
            }

        }
        for (int i = 0; i <= length - 1; i++) {
            System.out.println("temp Array --> " + tempArray[i]);
        }

    }
}
