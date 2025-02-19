class RightAlignedPyramid {
    public static void main(String[] args) {
        pattern1();
    }

    private static void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("^ ");
            }
            System.out.println();
        }
    }
}
