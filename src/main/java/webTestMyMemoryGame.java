import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class webTestMyMemoryGame {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
        WebDriverManager.safaridriver().setup();

        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("https://fiamont-frontend.herokuapp.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1*1000);

        WebElement level1 = driver.findElement(By.id("toLevel1"));

        level1.click();
        Thread.sleep(2*1000);

        WebElement cat = driver.findElement(By.name("Cat"));
        WebElement home = driver.findElement(By.tagName("button"));

        cat.click();
        Thread.sleep(3*1000);
        home.click();
        Thread.sleep(3*1000);

        driver.quit();
    }

}

