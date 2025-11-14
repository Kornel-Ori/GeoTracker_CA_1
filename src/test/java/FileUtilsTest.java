import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {

    @org.junit.jupiter.api.Test
    void readDelimitedFileTest() {
        System.out.println("Test for reading file");
        ArrayList<String> actResult = FileUtils.readDelimitedFile("src/main/country_samples.csv", ',');

        assertNotNull(actResult, "File reading returned null");
        assertFalse(actResult.isEmpty(), "File reading returned empty list");
        assertEquals("Atlantis", actResult.get(0));
        assertEquals("Atlantis", actResult.get(0));
    }
}