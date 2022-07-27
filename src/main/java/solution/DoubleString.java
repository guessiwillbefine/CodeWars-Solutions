package solution;

import java.util.Arrays;

public class DoubleString {
    public static String doubleChar(String s) {
        return s.split("")[0] + Arrays.stream(s.split("")).reduce((a, b) -> a + b + b).get().toString();
    }
}