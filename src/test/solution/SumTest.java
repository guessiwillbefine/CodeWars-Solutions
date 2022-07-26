package solution;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SumTest {
    @Test
    void testSomething() {
        assertEquals(SumWithoutMinAndMax.sum(new int[] {6, 2, 1, 8, 10}), 16);
    }
}
