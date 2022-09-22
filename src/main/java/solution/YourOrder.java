package solution;

import java.util.Arrays;

public class YourOrder {
    public static String order(String words) {
        if (words.length() == 0) return "Empty input should return empty string";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.split(" ").length + 1; i++) {
            int finalI = i;
            String s = Arrays.stream(words.split(" ")).filter(e -> e.contains(String.valueOf(finalI))).findFirst().orElse("");
            result.append(s).append(" ");
        }
        return result.delete(0, 1).delete(result.length()-1, result.length()).toString();
    }
}
