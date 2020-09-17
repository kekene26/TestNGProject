package com.techproed.tests;

import com.techproed.pages.GoogleAramaPage;
import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBaseFinal;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleAramaTest extends TestBaseFinal {

    //1. google.com a gidelim
    //2. techproed aramasi yapin
    //3. sonuclar icinde techproededucation.com varmi dogrulayalim



    @Test
    public void aramaTest() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("google_link"));

        GoogleAramaPage googleAramaPage = new GoogleAramaPage();

        googleAramaPage.aramaKutusu.sendKeys("techproeducation" + Keys.ENTER);

        Thread.sleep(3000);

        boolean linkVarmi= false;
        for(WebElement w : googleAramaPage.tumLinkler){
            if(w.getText().contains("techproeducation.com")){
                linkVarmi = true;
                break;
            }
        }
        extentTest.info("asset islemi yap");
        Assert.assertTrue(linkVarmi);
        extentTest.info("testimiz PASSED !")
    }
}
