package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HerokuAppTestCheckboxes {
    @Test
    public void herokuAppTestCheckboxes() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement firstСheckBox = driver.findElement(By.cssSelector("input:nth-child(1)"));
        Assert.assertFalse(firstСheckBox.isSelected());
        firstСheckBox.click();
        Assert.assertTrue(firstСheckBox.isSelected());
        WebElement secondСheckBox = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > input:nth-child(3)"));
        Assert.assertTrue(secondСheckBox.isSelected());
        secondСheckBox.click();
        Assert.assertFalse(secondСheckBox.isSelected());
        driver.quit();
    }
}