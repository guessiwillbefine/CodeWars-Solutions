package solution;

public class StringSplit {
    public static String[] solution(String s) {
        double len = (double) s.length() / 2;
        String[] temparr = s.split("");
        if (len % 2 == 0 || len % 2 == 1) {
            String[] result = new String[(int) len];
            int j = 0;
            for (int i = 0; i < result.length; i++) {
                result[i] = temparr[j] + temparr[j + 1];
                j += 2;
            }
            return result;
        } else {
            String[] result = new String[(int) len + 1];
            int j = 0;
            for (int i = 0; i < result.length-1; i++) {
                result[i] = temparr[j] + temparr[j + 1];
                j += 2;
            }
            result[result.length-1] = temparr[temparr.length-1] + "_";
            return result;
        }
    }
}