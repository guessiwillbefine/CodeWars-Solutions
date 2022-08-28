package solution;

import java.util.Arrays;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";
        int years = seconds / 86400 / 365;
        int days = seconds / 86400 % 365;
        int mins = (seconds % 3600) / 60;
        int hours = seconds / 3600 % 24;
        int secs = seconds % 60;
        StringBuilder result = new StringBuilder();
        if (years != 0) result.append(years).append(years > 1 ? " years" : " year").append(years > 0 ? ", " : "");
        if (days != 0) result.append(days).append(days > 1 ? " days" : " day").append(days > 0 ? ", " : "");
        if (hours != 0) result.append(hours).append(hours > 1 ? " hours" : " hour").append(mins > 0 ? ", " : "");
        if (mins != 0) result.append(mins).append(mins > 1 ? " minutes" : " minute").append(secs > 0 ? ", " : "");
        if (secs != 0) result.append(secs).append(secs > 1 ? " seconds" : " second");
        String[] swap = result.toString().split("");
        for (int i = swap.length - 1; i > 0; i--) {
            if (swap[i].matches(",")) {
                swap[i] = " and";
                break;
            }
        }
        return Arrays.stream(swap).reduce((a,b) -> a + b).get();
    }
}