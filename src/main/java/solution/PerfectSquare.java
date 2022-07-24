package solution;

public class PerfectSquare {
        public static long findNextSquare(long sq) {
            double res = (Math.sqrt(sq));
            return (res - (int)res > 0) ? -1 : (long) Math.pow(res + 1, 2.0);
        }
    }
