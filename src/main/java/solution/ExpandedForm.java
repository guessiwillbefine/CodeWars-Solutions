package solution;

public class ExpandedForm {
    public static String expandedForm(int num) {
        String[] s = String.valueOf(num).split("");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            if (!s[i].equals("0")) res.append(s[i]).append(addZeros(s.length - i - 1)).append(" + ");
        }
        return res.delete(res.length() - 3, res.length()).toString();
    }

    public static String addZeros(int len) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < len; i++) {
            s.append("0");
        }
        return s.toString();
    }
}
