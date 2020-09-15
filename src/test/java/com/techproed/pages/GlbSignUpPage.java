package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlbSignUpPage {

    public GlbSignUpPage () {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "email")
    public WebElement emailbox;

    @FindBy (id = "name")
    public WebElement namebox;

    @FindBy (id = "mobile")
    public WebElement phonebox;

    @FindBy (id = "password")
    public WebElement passwordbox;

    @FindBy (id = "re_password")
    public WebElement repasswordbox;

    @FindBy (name = "submit")
    public WebElement signUpButonu;

    @FindBy (xpath = "//div[@class = 'alert alert-success.']")
    public WebElement successYazisi;
}
