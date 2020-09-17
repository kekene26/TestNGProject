package com.techproed.SmokeTest;

import com.techproed.utilities.Driver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.security.auth.login.Configuration;

public class GlbSignUpTest {

    /*
     * 1. Adım : https://www.glbtrader.com/register-verified.html adresine gidelim
     * 2. Adım : GlbSignUpPage class'ından nesne üretip, webelementleri kullanalım.
     * 3. Adım : İçerisine ekleyeceğimiz bilgileri (name, email, phone vs) yine
     *           ConfigurationReader kullanarak, properties file'dan alalım.
     * 4. Adım : Sign-Up butonuna tıklayalım.
     * 5. Adım : Success yazısını görüp görmediğimi Assert ile doğrulayalım.
     *
     */

    @BeforeSuite
    public void beforesuit () {
        System.out.println("beforesuit calisti");
    }
    @BeforeTest
    public void beforetest () {
        System.out.println("beforetest calisti");
    }
    @Test
    public void test() {

    }

}
