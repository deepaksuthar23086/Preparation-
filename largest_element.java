class LargestElement {
    public static void main(String[] args) {
        int[] array = { 88, 22, 44, 11, 55, 22 };
        largestElement(array);
    }

    private static void largestElement(int[] arr) {
        int length = arr.length;
        int largeElement = 0;
        for (int i = 0; i <= length - 1; i++) {
            if (largeElement <= arr[i]) {
                largeElement = arr[i];
            }
        }
        System.out.println("large Element -->" + largeElement);
    }
}