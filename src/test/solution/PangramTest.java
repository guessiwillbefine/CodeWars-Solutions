package solution;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class PangramTest {
    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        assertTrue(PangramChecker.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        assertFalse(PangramChecker.check(pangram2));
    }
    @Test
    public void test6() {
        String pangram4 = "ABCD45EFGH,IJK,LMNOPQR56STUVW3XYZ";
        assertTrue(PangramChecker.check(pangram4));
    }
    @Test
    public void test4() {
        String pangram2 = "Pack my box with five dozen liquor jugs.";
        assertTrue(PangramChecker.check(pangram2));
    }
    @Test
    public void test5() {
        String pangram3 = "How quickly daft jumping zebras vex.";
        assertTrue(PangramChecker.check(pangram3));
    }
}