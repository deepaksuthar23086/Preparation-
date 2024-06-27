class DublicacyLinearSearch {
    public static void main(String[] args) {
        int[] array = { 8, 22, 4, 11, 5, 1, 22 };
        System.out.println("index list---> " + duplicateElement(array));
    }

    // Write a function to check if an array contains any duplicate elements using
    // linear search.
    private static boolean duplicateElement(int arr[]) {
        int length = arr.length - 1;
        boolean duplicateItem = false;
        for (int i = 0; i <= length; i++) {
            for (int j = i + 1; j <= length; j++) {
                if (arr[i] == arr[j]) {
                    duplicateItem = true;
                }
            }
        }
        return duplicateItem;
    }
}
