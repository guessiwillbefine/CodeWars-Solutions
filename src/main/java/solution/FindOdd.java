package solution;

import java.util.Arrays;

public class FindOdd {
    public static Object findIt(int[] ints) {
        int counter = 0;
        for (int q :  Arrays.stream(ints).sorted().distinct().toArray()) {
            for (int element : ints) 
                if (q == element) counter++;
            if (counter % 2 != 0) return q;
        }
        return null;
    }
}