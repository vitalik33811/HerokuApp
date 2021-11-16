package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    private static final String FILE_UPLOAD_PAGE_URL = "http://the-internet.herokuapp.com/upload";
    private static final By FILE_UPLOAD = By.id("file-upload");
    private static final By UPLOAD_BUTTON = By.id("file-submit");
    private static final By FILE_UPLOAD_TEXT = By.id("uploaded-files");

    public void openPage() {
        driver.get(FILE_UPLOAD_PAGE_URL);
    }

    public void selectFileFromDirectory(String path) {
        driver.findElement(FILE_UPLOAD).sendKeys(path);
    }

    public void clickOnUploadButton() {
        driver.findElement(UPLOAD_BUTTON).click();
    }

    public String getNameOfUploadedFile() {
        return driver.findElement(FILE_UPLOAD_TEXT).getText();
    }
}
