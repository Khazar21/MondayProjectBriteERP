package com.briteERP.tests.functionalTests.invoicing.configurations;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;


public class CreateBankAccounts extends TestBase {

    @Test
    public void DebitMethodsCBSelectable(){
        extentLogger = report.createTest(
                "Testing - Debit Methods displays two checkboxes and manual CB is selected by default");
        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Sign in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to invoicing page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Going to Accounting");
        pages.invoicingPage.accounting.click();
        extentLogger.info("Going to Bank Accounts");
        pages.invoicingPage.bankAccounts.click();
        BrowserUtilities.waitForTitleContains("Bank");
        extentLogger.info("Creating new Bank Account");
        pages.invoicingPage.createButton.click();
        BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.debitMethodsManualCB);
        extentLogger.info("Verifying checkboxes are displayed");
        Assert.assertTrue(pages.invoicingPage.debitMethodsManualCB.isDisplayed());
        Assert.assertTrue(pages.invoicingPage.debitMethodsElectronicCB.isDisplayed());
        extentLogger.info("Verifying manual checkbox is selected by default");
        Assert.assertTrue(pages.invoicingPage.debitMethodsManualCB.isSelected());
    }
        @Test
        public void PaymentMethodsCBSelectable(){
        extentLogger = report.createTest(
                "Testing - Payment Methods has two checkboxes and they are both selected by default");
        extentLogger.info("Choosing the Database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Sign in as manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to Invoicing page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        extentLogger.info("Going to Accounting");
        pages.invoicingPage.accounting.click();
        extentLogger.info("Going to Bank Accounts");
        pages.invoicingPage.bankAccounts.click();
        BrowserUtilities.waitForTitleContains("Bank");
        extentLogger.info("Creating new Bank Account");
        pages.invoicingPage.createButton.click();
        BrowserUtilities.waitForElementToBoVisible(pages.invoicingPage.paymentMethodsManualCB);
        extentLogger.info("Verifying checkboxes are displayed");
        Assert.assertTrue(pages.invoicingPage.paymentMethodsManualCB.isDisplayed());
        Assert.assertTrue(pages.invoicingPage.paymentMethodsChecksCB.isDisplayed());
        extentLogger.info("Verifying that manual and checks checkboxes are selected");
        Assert.assertTrue(pages.invoicingPage.paymentMethodsManualCB.isSelected());
        Assert.assertTrue(pages.invoicingPage.paymentMethodsChecksCB.isSelected());


        }

}
