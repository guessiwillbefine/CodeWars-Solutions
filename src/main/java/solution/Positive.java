package solution;
import java.util.Arrays;

public class Positive{

    public static int sum(int[] arr){
        return (arr.length == 0) ? 0 : Arrays.stream(arr).filter(a -> a > 0).sum();
    }
}