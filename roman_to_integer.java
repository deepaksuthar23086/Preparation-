import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    public static void main(String[] arr) {
        System.out.println("total value ===>" + romanToInt("MMXXIV"));
    }

    private static int romanToInt(String s) {
        Map<Character, Integer> romanMap = Map.of(
                'I', 1, 'V', 5, 'X', 10,
                'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char value1 = s.charAt(i);
            if (s.length() != i + 1) {
                char value2 = s.charAt(i + 1);
                if (romanMap.get(value1) >= romanMap.get(value2)) {
                    total = total + romanMap.get(value1);
                } else {
                    total = (romanMap.get(value2) - romanMap.get(value1)) + total;
                    i++;
                }
                continue;

            } else {
                total = total + romanMap.get(value1);
            }

        }
        return total;
    }
}