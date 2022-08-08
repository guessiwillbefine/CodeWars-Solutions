package solution;

public class Factorial {
    public static Integer factorial(int n) {
        if (n == 0) return 1;
        return (n * factorial(n - 1));
    }

    public static String getStr(int n) {
        return factorial(n).toString();
    }
}