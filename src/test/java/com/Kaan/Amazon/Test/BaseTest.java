package com.Kaan.Amazon.Test;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

WebDriver driver;

@Before
    public void setUp() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.gittigidiyor.com/");
    driver.manage().window().maximize();
    }


}
