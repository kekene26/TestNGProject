package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ornek_AmazonKayitSayfasi extends TestBase { //day 06.09.2020

    @Test
    public void test01() {
        driver.get("http://amazon.com");

        WebElement menu = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();

        WebElement starthereLinki = driver.findElement(By.partialLinkText("Start here."));
        starthereLinki.click();

        //Assert.assertTrue(driver.getTitle().equals("Amazon Registration"));
        //Assert.assertFalse(!driver.getTitle().equals("Amazon Registration"));
        Assert.assertEquals(driver.getTitle(),"Amazon Registration");

    }
    @Test(dependsOnMethods = "test01")
    public void test02() {

        driver.findElement(By.id("ap_customer_name")).sendKeys("burak deniz");
        driver.findElement(By.id("ap_email")).sendKeys("kenpiy@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("Burak626");
        driver.findElement(By.id("ap_password_check")).sendKeys("Burak626");
        driver.findElement(By.id("continue")).click();


    }

}
