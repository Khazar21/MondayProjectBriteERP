package com.briteERP.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

     protected WebDriver driver;
     protected Actions actions;
     protected SoftAssert softAssert;
     protected Pages pages;



     @BeforeMethod
    public void setup(){
         driver= Driver.getDriver();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         actions= new Actions(driver);
         softAssert= new SoftAssert();
         pages= new Pages();
         driver.get(ConfigurationReader.getProperty("url"));
     }

     @AfterMethod
    public void tearDown(){
       //  Driver.closeDriver();
         softAssert.assertAll();
     }

}