package solution;

import java.util.Arrays;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        int[] odd = Arrays.stream(array).filter(x -> x%2 != 0).sorted().toArray();
            for (int i = 0, j = 0;  j < odd.length; i++) {
                if (array[i] % 2 != 0) {
                    array[i] = odd[j];
                    j++;
                }
            }
        return array;
    }
}

