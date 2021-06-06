package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readDocxFile;

public class DocxAssertTest {

    @Test
    void docxAssertTest() throws IOException {
        String docFilePath = "./src/test/resources/files/1.docx";
        String expectedText = "elephants go north";

        String actualData = readDocxFile(docFilePath);
        assertThat(actualData, containsString(expectedText));

    }
}
