package com.briteERP.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilities {

    public static void waitForTitleContains(String word){
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleContains(word));
    }
    public static void waitForClickablility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
