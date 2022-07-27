package solution;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BuilderTests {
        @Test
        public void basicTests() {
            assertEquals(String.join(",", " * ", "***"), String.join(",", TowerBuilder.towerBuilder(2)));
            assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", TowerBuilder.towerBuilder(3)));
            assertEquals(String.join(",", "*"), String.join(",", TowerBuilder.towerBuilder(1)));
        }
    }
