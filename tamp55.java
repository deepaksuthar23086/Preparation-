import java.lang.reflect.Array;
import java.util.HashMap;

class PatternPrinter {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    private static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = s.charAt(i);
        }
        return value;
    }
}

class Modal {
    char key;
    int value;

    Modal(char key, int value) {
        this.key = key;
        this.value = value;
    }
}