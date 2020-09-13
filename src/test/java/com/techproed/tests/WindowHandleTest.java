package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTest extends TestBase {

    @Test
    public void cokluPencereTest() {
        driver.get("https://the-internet.herokuapp.com/windows");

        String sayfaninHandlesi = driver.getWindowHandle();
        System.out.println(sayfaninHandlesi);

        driver.findElement(By.partialLinkText("Click Here")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> tumpencereler = driver.getWindowHandles();

        //elimizdeki tum pencerelerin windows handlelerini bu sekilde yazdirabiliriz
        //for(String handle : tumpencereler) {
        //    System.out.println(handle);
        //}

        Object[] array = (Object[])   tumpencereler.toArray();
        String ikincisayfaninHandle = (array)[array.length-1].toString();
        System.out.println(ikincisayfaninHandle);

        driver.switchTo().window(sayfaninHandlesi);
    }
}
