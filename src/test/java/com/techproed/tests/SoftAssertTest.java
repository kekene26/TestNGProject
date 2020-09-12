package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test01() {
        driver.get("http://amazon.com");
        String baslik = driver.getTitle();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertFalse(baslik.contains("Amazon"));
        softAssert.assertTrue(baslik.contains("Car"));
        softAssert.assertEquals("Online", baslik);

        softAssert.assertAll();


    }
}
