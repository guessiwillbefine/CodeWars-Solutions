package solution;

import java.util.Arrays;

public class DRoot {
    public static int digital_root(int i) {
       String[] temp = String.valueOf(i).split("");
       int value = Integer.parseInt(Arrays.stream(temp).reduce((a,b) -> String.valueOf(Integer.parseInt(a) + Integer.parseInt(b))).get());
       return String.valueOf(value).length() > 1 ? digital_root(value) : value;
    }
}
