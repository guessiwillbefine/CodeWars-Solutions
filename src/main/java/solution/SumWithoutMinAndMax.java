package solution;

import java.util.Arrays;

public class SumWithoutMinAndMax {
    public static int sum(int[] arr){
        Arrays.sort(arr);
        return Arrays.stream(arr).sum() - arr[0] - arr[arr.length-1];
    }
}
