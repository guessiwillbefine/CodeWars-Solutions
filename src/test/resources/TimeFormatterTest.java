package resources;

import org.testng.annotations.Test;
import solution.TimeFormatter;

import static org.testng.AssertJUnit.assertEquals;

public class TimeFormatterTest {
    @Test
    public void exampleTests() {
        assertEquals("1 second", TimeFormatter.formatDuration(1));
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
        assertEquals("182 days, 1 hour, 44 minutes and 40 seconds", TimeFormatter.formatDuration(15731080));
        assertEquals("4 years, 68 days, 3 hours and 4 minutes", TimeFormatter.formatDuration(132030240));
        assertEquals("6 years, 192 days, 13 hours, 3 minutes and 54 seconds", TimeFormatter.formatDuration(205851834));
        assertEquals("8 years, 12 days, 13 hours, 41 minutes and 1 second", TimeFormatter.formatDuration(253374061));
        assertEquals("7 years, 246 days, 15 hours, 32 minutes and 54 seconds", TimeFormatter.formatDuration(242062374));
        assertEquals("3 years, 85 days, 1 hour, 9 minutes and 26 seconds", TimeFormatter.formatDuration(101956166));
        assertEquals("1 year, 19 days, 18 hours, 19 minutes and 46 seconds", TimeFormatter.formatDuration(33243586));
    }
}
