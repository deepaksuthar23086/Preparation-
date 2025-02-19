public class PyramidStarPattern {
    public static void main(String[] args) {
        pyramidStarPattern1();
    }

    private static void pyramidStarPattern1() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
