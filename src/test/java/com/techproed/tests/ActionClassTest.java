package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class ActionClassTest extends TestBase {

    @Test
    public void sagaTiklama(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement element = driver.findElement(By.id("hot-spot"));
        Actions actions = new  Actions(driver);

        actions.contextClick(element).perform();


    }

    @Test
    public void ciftTiklama() {
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Actions actions = new Actions(driver);
        actions.doubleClick().perform();
    }

    @Test
    public void hoverOver () {
        driver.get("http://amazon.com");
        WebElement menu = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();

    }

    @Test
    public void asagiYukari() {
        driver.get("http://amazon.com");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys(Keys.END).perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys(Keys.PAGE_UP).perform();
    }

    @Test
    public void buyukKucukYazma() {
        driver.get("http://google.com");

        WebElement aramaKutusu = driver.findElement(By.name("q"));

        //standart yazma metodumuz
        //aramaKutusu.sendKeys("merhaba nasilsiniz");

        //shifte basili tutarak her karakteri buyuk yazma
      //  aramaKutusu.sendKeys(Keys.SHIFT + "merhaba nasilsiniz");

        Actions actions= new Actions(driver);
        actions.moveToElement(aramaKutusu).click()
                .keyDown(Keys.SHIFT)
                .sendKeys("merhaba")
                .keyUp(Keys.SHIFT)
                .sendKeys("nasilsiniz")
                .perform();

    }

    @Test
    public void ragAndDrop() {
        driver.get("http://google.com");
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        WebElement logo = driver.findElement(By.id("hplogo"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(logo,aramaKutusu).perform();

    }
}
