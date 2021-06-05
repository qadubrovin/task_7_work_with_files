package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;

public class TxtAssertTests {

    @Test
    void txtAssertTest() throws IOException {
        String txtFilePath = "./src/test/resources/files/1.txt";
        String expectedText = "Слоны идут на север";

        String actualText = readTextFromPath(txtFilePath);
        assertThat(actualText, containsString(expectedText));

    }
}
