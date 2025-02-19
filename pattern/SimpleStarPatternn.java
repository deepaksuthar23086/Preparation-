class SimpleStarPattern {
    public static void main(String[] args) {
        simpleStarPattern1();
        simpleStarPattern2();
        simpleStarPattern3();
    }

    private static void simpleStarPattern1() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void simpleStarPattern2() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void simpleStarPattern3() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
