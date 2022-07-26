package solution;
import java.util.Arrays;
public class MapAllElements {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(a->a*2).toArray();
    }
}