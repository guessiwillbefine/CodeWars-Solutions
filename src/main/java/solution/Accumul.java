package solution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Accumul {
    public static String accum(String s) {
        Pattern pattern = Pattern.compile("\\w");
        Matcher matcher = pattern.matcher(s);
        StringBuilder res = new StringBuilder();
        int counter = 0;
        while (matcher.find()) {
            res.append(matcher.group().toUpperCase());
            for (int i = 0; i < counter; i++) {
                res.append(matcher.group().toLowerCase());
            }
            counter++;
            res.append("-");
        }
        return res.delete(res.length()-1,res.length()).toString();
    }
}