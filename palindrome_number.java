class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(23232));
    }

    private static boolean isPalindrome(int x) {
        String temp = String.valueOf(x);
        int temp2 = 0;
        boolean value = false;
        for (int i = temp.length() - 1; i >= 0; i--) {

            if (temp.charAt(i) == temp.charAt(temp2)) {
                value = true;
            } else {
                return false;
            }
            ++temp2;
        }
        return value;
    }
}
