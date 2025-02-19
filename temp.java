class SeriesGenerator {
    // LeftAlignedPyramid
    public static void main(String[] args) {
        int n = 10; // Change this to the desired number of terms
        // febonacciSeries(n);
        System.out.println();
        System.out.println();
        pattern3();
        System.out.println();
        pattern4();

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

    private static void pattern5() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern3() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    private static void pattern4() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
