package solution;
import java.util.Arrays;
public class PangramChecker {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static boolean check(String sentence){
        return  Arrays.stream(sentence.toLowerCase().split(""))
                .filter(a -> a.matches("[a-zA-Z]"))
                .distinct()
                .sorted()
                .reduce((a,b) -> a+b).get()
                .equals(ALPHABET);
    }
}
