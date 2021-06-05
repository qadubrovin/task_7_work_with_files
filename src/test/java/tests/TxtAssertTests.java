package tests;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class TxtAssertTests {

    @Test
    void txtAssertTest() throws IOException {
        String txtFilePath = "./src/test/resources/files/1.txt";
        String expectedText = "Слоны идут на север";

        String fileText = FileUtils.readFileToString(new File(txtFilePath), StandardCharsets.UTF_8);
        assertThat(fileText, containsString(expectedText));



    }
}
