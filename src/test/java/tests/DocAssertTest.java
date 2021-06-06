package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readDocFile;

public class DocAssertTest {

    @Test
    void docAssertTest() throws IOException {
        String docFilePath = "./src/test/resources/files/1.doc";
        String expectedText = "elephants go north";

        String actualData = readDocFile(docFilePath);
        assertThat(actualData, containsString(expectedText));

    }
}
