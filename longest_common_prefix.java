class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = { "flower", "flow", "flight" };
        String v = longestCommonPrefix(str);
    }

    private static String longestCommonPrefix(String[] strs) {
        String commonStr = "";
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                System.out.println("char - " + strs[i].charAt(j));
            }
        }
        return "";
    }
}
