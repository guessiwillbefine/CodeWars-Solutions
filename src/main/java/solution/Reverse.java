package solution;

import java.util.Collections;
import java.util.List;

public class Reverse {
    public static String reverse(String str){
        List<String> words = new java.util.ArrayList<>(List.of(str.split(" ")));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}
