package solution;


import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class MapTest {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[]{2, 4, 6}, MapAllElements.map(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{8, 2, 2, 2, 8}, MapAllElements.map(new int[]{4, 1, 1, 1, 4}));
        assertArrayEquals(new int[]{2, 2, 2, 2, 2, 2}, MapAllElements.map(new int[]{1, 1, 1, 1, 1, 1}));
    }
}