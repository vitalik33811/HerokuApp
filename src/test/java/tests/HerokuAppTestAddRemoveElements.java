package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HerokuAppTestAddRemoveElements {
    @Test
    public void herokuAppTestAddRemoveElements() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.tagName("button"));
        for (int i = 0; i < 2; i++) {
            addElementButton.click();
        }
        WebElement deleteElementButton = driver.findElement(By.className("added-manually"));
        deleteElementButton.click();
        int addedButtonsCount = driver.findElements(By.className("added-manually")).size();
        Assert.assertEquals(addedButtonsCount, 1);
        driver.quit();
    }
}