class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 8, 22, 4, 11, 5, 1, 22 };
        bubbleSort(array);
        for (int num : array) {
            System.out.println("---> " + num);
        }
    }

    private static void bubbleSort(int arr[]) {
        int length = arr.length - 1;
        for (int i = 0; i <= length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
