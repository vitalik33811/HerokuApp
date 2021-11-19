package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    private static final By HOT_SPOT = By.xpath("//*[@id='hot-spot']");
    private static final String CONTEXT_MENU_URL = "http://the-internet.herokuapp.com/context_menu";

    public void openPage() {
        driver.get(CONTEXT_MENU_URL);
    }

    public void rightClickHotSpot() {
        Actions actions = new Actions(driver);
        WebElement rightClick = driver.findElement(HOT_SPOT);
        actions.contextClick(rightClick).perform();
        waitForAlert(10);

    }
    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
    public void closeAlert() {
        driver.switchTo().alert().accept();
    }
}
