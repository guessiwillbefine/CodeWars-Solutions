package solution;

import java.util.*;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        return Math.toIntExact(arr.stream().filter(x -> x.matches("^[:;][-~]?[)D]$")).count());
    }
}

