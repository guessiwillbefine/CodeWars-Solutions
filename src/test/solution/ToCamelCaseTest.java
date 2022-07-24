package solution;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ToCamelCaseTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
}

