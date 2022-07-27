package solution;

import java.util.Arrays;
import java.util.Optional;

public class JadenCase {
    public String toJadenCase(String sentence) {
        if (sentence == null || sentence == "") return null;
        Object[] temp =  Arrays.stream(sentence.split(" "))
                .map(a -> String.valueOf(a.split("")[0].toUpperCase().toCharArray()) + a.substring(1))
                .toArray();
        StringBuilder result = new StringBuilder();
        for (Object o : temp) result.append(" ").append(o.toString());
        return result.substring(1);
    }

    public static void main(String[] args) {
        JadenCase jadenCase = new JadenCase();
        jadenCase.toJadenCase("Most Trees Are Blue");
    }
}

/**     @кросивое
 *
 * return Arrays.stream(phrase.split(" "))
 .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
 .collect(Collectors.joining(" "));
 *
 */