package solution;

import java.util.Arrays;
import java.util.Comparator;

public class ShortestWord {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
    return words[0].length();
    }
}
/** мега красивое решение через стримы
 * public static int findShort(String s) {
 *         return Stream.of(s.split(" "))
 *           .mapToInt(String::length)
 *           .min()
 *           .getAsInt();
 *     }
 */