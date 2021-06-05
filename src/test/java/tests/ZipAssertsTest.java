package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;
import static utils.Zip.unzip;

public class ZipAssertsTest {

    @Test
    void zipAssertTest() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/files/1.zip";
        String unzipFolderPath = "./src/test/resources/files/unzip";
        String zipPassword = "";
        String unzipTxtFilePath = "./src/test/resources/files/unzip/1.txt";
        String expectedText = "Слоны идут на север";

        unzip(zipFilePath, unzipFolderPath, zipPassword);
        String actualText = readTextFromPath(unzipTxtFilePath);
        assertThat(actualText, containsString(expectedText));
    }
}
