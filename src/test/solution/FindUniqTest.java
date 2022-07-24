package solution;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FindUniqTest {
    private final static double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, FindUnique.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindUnique.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }
}