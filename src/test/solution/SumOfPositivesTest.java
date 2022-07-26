package solution;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SumOfPositivesTest {
        @Test
        public void testSomething() {
            assertEquals(15, Positive.sum(new int[]{1,2,3,4,5}));
            assertEquals(13, Positive.sum(new int[]{1,-2,3,4,5}));
            assertEquals(0, Positive.sum(new int[]{}));
            assertEquals(0, Positive.sum(new int[]{-1,-2,-3,-4,-5}));
            assertEquals(9, Positive.sum(new int[]{-1,2,3,4,-5}));
        }
    }
