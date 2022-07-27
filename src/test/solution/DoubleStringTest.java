package solution;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DoubleStringTest {
    @Test
    void sampleTest() {
        assertEquals("SSttrriinngg",DoubleString.doubleChar("String"));
        assertEquals("HHeelllloo  WWoorrlldd",DoubleString.doubleChar("Hello World"));
        assertEquals("11223344!!__  ",DoubleString.doubleChar("1234!_ "));
    }
}