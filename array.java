class array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = arr.length-1; i >=0; i--) {
        System.out.println("for " + arr[i]);
        }
        int i = arr.length - 1;
        while (i >= 0) {
            System.out.println("value" + arr[i]);
            i--;
        }
    }
}