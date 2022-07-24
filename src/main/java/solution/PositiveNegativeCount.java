package solution;

import java.util.Arrays;

public class PositiveNegativeCount {
    public static int[] countPositivesSumNegatives(int[] ints) {
        if (ints==null || ints.length == 0) return new int[]{};
        return new int[]{
                (int) Arrays.stream(ints).filter(a -> a > 0).count(),
                Arrays.stream(ints).filter(a -> a < 0).reduce(Integer::sum).getAsInt()
        };
    }
}
