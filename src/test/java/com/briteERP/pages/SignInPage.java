package com.briteERP.pages;

import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class SignInPage {
    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//a[@class='btn btn-default']")
    public WebElement selectDataBase;
    @FindBy(id = "login")
    public WebElement email;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;
    @FindBy(className = "alert alert-danger")
    public WebElement errorMessage;



      public void signIn(){
    email.sendKeys(ConfigurationReader.getProperty("emailLunchInvoicingManager"));
    password.sendKeys(ConfigurationReader.getProperty("passwordLunchInvoicingManager"));
    loginButton.click();
}



}