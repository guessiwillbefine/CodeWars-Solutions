package solution;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FindNextSquareTest {
    @Test
    public void test1() {
        assertEquals(144, PerfectSquare.findNextSquare(121));
    }
    @Test
    public void test2() {
        assertEquals(676, PerfectSquare.findNextSquare(625));
    }
    @Test
    public void test3() {
        assertEquals(-1, PerfectSquare.findNextSquare(114));
    }


}