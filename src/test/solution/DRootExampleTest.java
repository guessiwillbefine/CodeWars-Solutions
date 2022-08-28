package solution;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DRootExampleTest {
    @Test
    public void Test1() {
        assertEquals( "Nope!" , 7, DRoot.digital_root(16));
    }
    @Test
    public void Test2() {
        assertEquals( "Nope!" , 6, DRoot.digital_root(456));
    }
}