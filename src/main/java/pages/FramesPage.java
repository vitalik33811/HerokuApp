package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage {

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    private static final String PAGE_URL = "http://the-internet.herokuapp.com/frames";
    private static final By IFRAME_BUTTON = By.xpath("//*[@href='/iframe']");
    private static final By IFRAME = By.xpath("//*[@id='mce_0_ifr']");
    private static final By IFRAME_TEXT = By.xpath("//*[@id='tinymce']");

    public void openPage() {
        driver.get(PAGE_URL);
    }

    public void openIframe() {
        driver.findElement(IFRAME_BUTTON).click();
    }

    public String iFrameBoxText() {
        driver.switchTo().frame(driver.findElement(IFRAME));
        waitForElementIsLocated(IFRAME_TEXT, 5);
        return driver.findElement(IFRAME_TEXT).getText();
    }
}
