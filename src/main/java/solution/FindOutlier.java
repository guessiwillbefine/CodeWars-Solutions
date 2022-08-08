package solution;

import java.util.Arrays;

public class FindOutlier {
    public static int find(int[] arr) {
        int[] odd = Arrays.stream(arr).filter(x -> x%2!=0).toArray();
        int[] even = Arrays.stream(arr).filter(x -> x%2==0).toArray();
    return odd.length == 1 ? odd[0] : even[0];
    }
}
