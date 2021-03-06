package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HerokuAppTestTypos {
    @Test
    public void herokuAppTestTypos() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/typos");
        String textFromElement = driver.findElement(By.cssSelector("div > p:nth-of-type(1)")).getText();
        Assert.assertEquals(textFromElement, "This example demonstrates a typo being introduced. It does it randomly on each page load.");
        String textFromElementOne = driver.findElement(By.cssSelector("div > p:nth-of-type(2)")).getText();
        Assert.assertEquals(textFromElementOne, "Sometimes you'll see a typo, other times you won't.");
        driver.quit();
    }
}