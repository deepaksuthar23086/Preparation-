class SeriesGenerator {

    public static void main(String[] args) {
        int n = 10; // Change this to the desired number of terms
        febonacciSeries(n);

    }

    private static void febonacciSeries(int n) {
        int n1 = 0, n2 = 1, n3 = 0;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 0; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }

    }

    public static void series() {

    }

    private static void series(int n) {
        for (int i = 1; i < n; i++) {
            int term = i * i * i + 1;
            System.out.print(term + " ");
        }
    }

}
