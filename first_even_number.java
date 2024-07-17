class FirstEvenNumber {
    public static void main(String[] args) {
        int n = 4;
        firstEvenNumber(n);
        firstOddNumber(n);
    }

    public static void firstEvenNumber(int n) {
        System.out.println(n * (n + 1));

    }

    public static void firstOddNumber(int n) {
        System.out.println(n * (n + 1) - 1);
    }
}
