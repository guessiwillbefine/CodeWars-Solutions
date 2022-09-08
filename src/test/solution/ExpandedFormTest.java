package solution;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ExpandedFormTest {

    @Test
    public void testSomething() {
        assertEquals("10 + 2", ExpandedForm.expandedForm(12));
        assertEquals("40 + 2", ExpandedForm.expandedForm(42));
        assertEquals("70000 + 300 + 4", ExpandedForm.expandedForm(70304));

    }
}
