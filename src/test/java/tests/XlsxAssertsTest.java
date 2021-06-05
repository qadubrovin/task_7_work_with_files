package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.getXls;
import static utils.Files.readXlsxFromPath;

public class XlsxAssertsTest {

    @Test
    void xlsxAssertTest() throws IOException {
        String xlsxFilePath = "./src/test/resources/files/1.xlsx";
        String expectedText = "Слоны идут на север";

        String actualData = readXlsxFromPath(xlsxFilePath);
        assertThat(actualData, containsString(expectedText));

    }
}
