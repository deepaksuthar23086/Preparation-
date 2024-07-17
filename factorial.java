class Factorial {
    public static void main(String[] args) {
        factorial(10);
    }

    private static void factorial(int n) {
        int multi = 1;

        for (int i = 1; i < n; i++) {
            int a = 1;
            a = a * i;
            multi = multi * a;
            System.out.println(multi);
        }
    }

}