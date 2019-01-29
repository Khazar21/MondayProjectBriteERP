package com.briteERP.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public  class TestBase {
    private TestBase(){}

     protected WebDriver driver;
     protected Actions actions;
     protected SoftAssert softAssert;



     @BeforeMethod
    public void setup(){
         driver= Driver.getDriver();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         actions= new Actions(driver);
         softAssert= new SoftAssert();
     }

     @AfterMethod
    public void tearDown(){
         Driver.closeDriver();
         softAssert.assertAll();
     }

}
