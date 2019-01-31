package com.briteERP.tests.smokeTests;

import com.briteERP.utilities.ApplicationConstants;
import com.briteERP.utilities.Driver;
import com.briteERP.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageHeadersTest extends TestBase {
    @Test
    public void pageHeaders() throws InterruptedException {
        pages.odooPage.briteERPDemo.click();
        pages.signInPage.signIn();
        pages.menuUser.invoicing.click();
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleContains("Invoices"));
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.CUSTOMER_INVOICES);



    }
}
