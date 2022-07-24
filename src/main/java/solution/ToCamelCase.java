package solution;

public class ToCamelCase {
    static String toCamelCase(String s) {
        String result = "";
        boolean flag = false;
        for (String temp : s.split("")) {
            if (!temp.equals("-") && !temp.equals("_")) {
                if (flag) {
                    result = result + temp.toUpperCase();
                    flag = false;
                } else {
                    result = result + temp;
                }
            } else {
                flag = true;
            }
        }
        return result;
    }
}