import java.util.ArrayList;
import java.util.List;

class GroupAnagram {
    public static void main(String[] args) {
        String[] data = { "eat", "tea", "tan", "ate", "nat", "bat" };
        groupAnagrams(data);
    }

    public static void groupAnagrams(String[] strs) {
        List<List<String>> afterAddData = new ArrayList<>();
        for (int i = 8; i < strs.length; i++) {
            String data = strs[i];
            for (int j = 0; j < data.length(); j++) {

            }
        }
    }
}