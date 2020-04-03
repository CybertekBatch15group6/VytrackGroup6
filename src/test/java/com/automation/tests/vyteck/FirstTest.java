package com.automation.tests.vyteck;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
