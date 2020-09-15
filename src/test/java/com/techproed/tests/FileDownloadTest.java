package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloadTest extends TestBase {

    @Test
    public void dosyaVarmi() {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));

        String kullaniciDsoyaYolu = System.getProperty("user.dir");
        String poomXmldosyaYolu = kullaniciDsoyaYolu + "/pom.xml" ;

        boolean varmi = Files.exists(Paths.get(poomXmldosyaYolu));
        Assert.assertTrue(varmi);

    }


}
