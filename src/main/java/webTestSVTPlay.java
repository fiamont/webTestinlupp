import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

public class webTestSVTPlay {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
        WebDriverManager.safaridriver().setup();

        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("https://svtplay.se");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        Thread.sleep(2*1000);

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Bäst i test");
        System.out.println(searchBox.getAttribute("value"));

        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        Thread.sleep(1*1000);

        searchBox.sendKeys(Keys.RETURN);

        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        Thread.sleep(2*1000);

        WebElement firstSearchResult = driver.findElement(By.tagName("em"));

        firstSearchResult.click();

        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        Thread.sleep(2*1000);

        String pWithText = driver.findElement(By.className("jmUUdw")).getText();
        System.out.println(pWithText);

        Thread.sleep(3*1000);

        WebElement playVideo = driver.findElement(By.className("hSZGAr"));

        playVideo.click();

        Thread.sleep(10*1000);

        driver.quit();
    }
}
