class LeftAlignedPyramid {
    public static void main(String[] args) {
        pattern1("DEEPAK");
        pattern2();
        pattern3();
        pattern4();
        pattern5();
    }

    private static void pattern1(String str) {
        for (int i = 0; i < 5; i++) {
            char alphabet = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j) + " ");
                alphabet++;
            }
            System.out.println();
        }
    }

    private static void pattern2() {
        for (int i = 0; i < 5; i++) {
            char alphabet = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }

    private static void pattern3() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void pattern4() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void pattern5() {
        for (int i = 1; i < 5; i++) {
            int temp = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp = temp == 0 ? 1 : 0;
            }
            System.out.println();
        }
    }
}
