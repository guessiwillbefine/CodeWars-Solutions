package solution;

import java.util.*;
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int result = 0;
        long temp;
        Set<String> stringSet = new HashSet<>(Arrays.asList(text.toLowerCase().split("")));
        for (String s : stringSet) {
            temp = Arrays.stream(text.toLowerCase().split("")).filter(x -> Objects.equals(s, x)).count();
            if (temp > 1) result++;
        }
        return result;
    }
}
