class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 8, 22, 4, 11, 5, 1, 22 };
        selectionSort(array);
        for (int num : array) {
            System.out.println("---> " + num);
        }
    }

    private static void selectionSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int min = array[i];
            for (int j = i + 1; j < length; j++) {
                if (min > array[j]) {
                    int temp = min;
                    min = array[j];
                    array[j] = temp;
                }
            }
            array[i] = min;
        }
    }
}
