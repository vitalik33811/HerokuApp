package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage extends BasePage {
    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    private static final String DYNAMIC_CONTROLS_URL = "http://the-internet.herokuapp.com/dynamic_controls";
    private static final By CHECKBOX_BUTTON = By.xpath("//*[@id='checkbox']/input");
    private static final By REMOVE_BUTTON = By.xpath("//*[@type='button']");
    private static final By TEXT_REMOVE = By.xpath("//*[@id='message']");
    private static final By INPUT_BUTTON = By.xpath("//*[@id='input-example']/input");
    private static final By ENABLE_BUTTON = By.xpath("//*[@id='input-example']/button");


    public void openPage() {
        driver.get(DYNAMIC_CONTROLS_URL);
    }

    public boolean checkboxDisplayed() {
        return driver.findElement(CHECKBOX_BUTTON).isDisplayed();
    }

    public void clickRemoveButton() {
        driver.findElement(REMOVE_BUTTON).click();
        waitForElementIsLocated(TEXT_REMOVE, 10);
    }

    public String getRemoveButtonName() {
        return driver.findElement(REMOVE_BUTTON).getText();
    }

    public String getTextAfterClick() {
        return driver.findElement(TEXT_REMOVE).getText();
    }

    public boolean сheckCheckbox() {
        return driver.findElements(CHECKBOX_BUTTON).size() < 1;
    }

    public boolean inputDisplayed() {
        return driver.findElement(INPUT_BUTTON).isDisplayed();
    }

    public boolean inputEnabled() {
        return driver.findElement(INPUT_BUTTON).isEnabled();
    }

    public void clickEnableButton() {
        driver.findElement(ENABLE_BUTTON).click();
        waitForElementIsLocated(TEXT_REMOVE, 10);
    }

    public String buttonOnName() {
        return driver.findElement(ENABLE_BUTTON).getText();
    }
}
