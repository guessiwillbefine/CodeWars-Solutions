package solution;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ReverseTest {
    @Test
    public void testSomething() {
        assertEquals("eating like I", Reverse.reverse("I like eating"));
        assertEquals("flying like I", Reverse.reverse("I like flying"));
        assertEquals("nice is world The", Reverse.reverse("The world is nice"));
    }
}
