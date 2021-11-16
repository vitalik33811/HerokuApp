package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTests {

    private static final String PATH_FILE = "C:\\Users\\vital\\Desktop\\file.txt";
    private static final String FILE_NAME = "file.txt";

    @Test
    public void uploadFileTest() {

        fileUploadPage.openPage();
        fileUploadPage.selectFileFromDirectory(PATH_FILE);
        fileUploadPage.clickOnUploadButton();
        Assert.assertEquals(fileUploadPage.getNameOfUploadedFile(), FILE_NAME);
    }
}
