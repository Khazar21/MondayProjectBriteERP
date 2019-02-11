package com.briteERP.tests.functionalTests.invoicing.configurations;

import com.briteERP.utilities.BrowserUtilities;
import com.briteERP.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentAcquirers extends TestBase {
    @Test
    public void activeCheckBox() throws InterruptedException {
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");

        extentLogger.info("Going to the Configuration Management");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going yo the 'Configuration Payments'");
        pages.invoicingPage.configurationPayments.click();

        extentLogger.info("Going to the 'Payment Acquires' page");
        pages.invoicingPage.paymentAcquirers.click();

        extentLogger.info("Displaying text of 'Payment Acquirers'");
        Assert.assertTrue(pages.configurationPage.headerTextPaymAcq.isDisplayed());

        extentLogger.info("Clicking on'Create' button");
        pages.invoicingPage.createButton.click();

    }

    @Test
    public void messagesAfterCheckBox() throws InterruptedException {
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");

        extentLogger.info("Going to the Configuration Management");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going yo the 'Configuration Payments'");
        pages.invoicingPage.configurationPayments.click();

        extentLogger.info("Going to the 'Payment Acquires' page");
        pages.invoicingPage.paymentAcquirers.click();
        Thread.sleep(2000);
        extentLogger.info("Clicking on'Create' button");
        pages.invoicingPage.createButton.click();

        System.out.println(pages.invoicingPage.pageHeader.getText());

//        extentLogger.info("Confirming title");
//        Assert.assertTrue("New - Odoo".equals(driver.getTitle()));

        extentLogger.info("Confirmating header of 'Messages' page after clicking Create button");
        Assert.assertTrue("Payment Acquirers".equals(pages.configurationPage.headerInNewPage.getText()));

        extentLogger.info("Displaying text of 'Pending Message'");
        Assert.assertTrue(pages.configurationPage.pendingMessage.isDisplayed());

    }

    @Test
    public void configurationAfterCheckBox() throws InterruptedException {
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");

        extentLogger.info("Going to the Configuration Management");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going yo the 'Configuration Payments'");
        pages.invoicingPage.configurationPayments.click();

        extentLogger.info("Going to the 'Payment Acquires' page");
        pages.invoicingPage.paymentAcquirers.click();

        Thread.sleep(2000);
        extentLogger.info("Clicking on'Create' button");
        pages.invoicingPage.createButton.click();


        extentLogger.info("Clicking on 'Configuration' button");
        pages.configurationPage.configurationButton.click();

        System.out.println(pages.configurationPage.headerOnPopUpInNewPage.getText());
        System.out.println(pages.configurationPage.typeInNewPage.getText());
        System.out.println(pages.configurationPage.shortCodeInNewPage.getText());
        System.out.println(pages.configurationPage.nextNumberInNewPage.getText());

        extentLogger.info("Clicking on 'Payment Journal'");
//        BrowserUtilities.waitForClickablility(pages.configurationPage.paymentJournal);
        Thread.sleep(5000);
        pages.configurationPage.paymentJournal.click();

    }

    @Test
    public void PaymentJournalAfterCheckBox() throws InterruptedException {
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");

        extentLogger.info("Going to the Configuration Management");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going yo the 'Configuration Payments'");
        pages.invoicingPage.configurationPayments.click();

        extentLogger.info("Going to the 'Payment Acquires' page");
        pages.invoicingPage.paymentAcquirers.click();

        Thread.sleep(2000);
        extentLogger.info("Clicking on'Create' button");
        pages.invoicingPage.createButton.click();


        extentLogger.info("Clicking on 'Configuration' button");
        pages.configurationPage.configurationButton.click();

        extentLogger.info("Clicking on 'Payment Journal'");
        BrowserUtilities.waitForClickablility(pages.configurationPage.paymentJournal);
        pages.configurationPage.paymentJournal.click();

        extentLogger.info("Confirming header of pop-up");
        Assert.assertTrue(pages.configurationPage.paymentJournal.getText().contains(pages.configurationPage.headerOnPopUpInNewPage.getText()));

        extentLogger.info("Displaying 'Bank' in 'Type' as default");
        Assert.assertTrue(pages.configurationPage.typeInNewPage.isDisplayed());

        extentLogger.info("Displaying '1' in 'Short Code' as default");
        Assert.assertTrue(pages.configurationPage.shortCodeInNewPage.isDisplayed());

        extentLogger.info("Displaying '2' in 'Short Code' as default");
        Assert.assertTrue(pages.configurationPage.nextNumberInNewPage.isDisplayed());

    }

    @Test
    public void AttachmentDropdownInNewCheckBox() throws InterruptedException {
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
        pages.menuUser.invoicing.click();

        extentLogger.info("Going to the Configuration Management");
        BrowserUtilities.waitForTitleContains("Invoices");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going yo the 'Configuration Payments'");
        pages.invoicingPage.configurationPayments.click();

        extentLogger.info("Going to the 'Payment Acquires' page");
        pages.invoicingPage.paymentAcquirers.click();

        Thread.sleep(2000);
        extentLogger.info("Clicking on'Create' button");
        pages.invoicingPage.createButton.click();

        extentLogger.info("Clicking on 'Configuration' button");
        Thread.sleep(3000);
        pages.configurationPage.configurationButton.click();

        extentLogger.info("Clicking on 'Payment Journal'");
//        BrowserUtilities.waitForClickablility(pages.configurationPage.paymentJournal);
        Thread.sleep(3000);
        pages.configurationPage.paymentJournal.click();


        Thread.sleep(3000);
        extentLogger.info("Clicking on 'Attachment(s)' dropdown");
        pages.configurationPage.attachmentDropdown.click();

        extentLogger.info("Adding item to attach");
        WebElement add = pages.configurationPage.addInAttachment;
//        add.click();
        String path = "C:\\Users\\Toshiba\\Desktop\\delete.xlsx";
        add.sendKeys(path);

//        extentLogger.info("Displaying the added item");
//        add.click();
//        System.out.println(pages.configurationPage.isAddedItem.getText());
//        Assert.assertTrue(pages.configurationPage.isAddedItem.isDisplayed());

        extentLogger.info("Deleting an item");
        Thread.sleep(2000);
        pages.configurationPage.attachmentDropdown.click();
        Thread.sleep(2000);
        pages.configurationPage.deleteAddedItem.click();

        extentLogger.info("Confirmation deleteing");
        pages.configurationPage.confirmationDeleting.click();


    }

    @Test
    public void ActionDropdownInNewCheckBox() throws InterruptedException {
        extentLogger = report.createTest("is displayed a new page after clicking to the 'Create' button");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in as a Manager");
        pages.signInPage.signIn("manager");
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        extentLogger.info("Going to the Invoicing Page");
//        BrowserUtilities.waitForTitleContains("Invoices");
        pages.menuUser.invoicing.click();

        extentLogger.info("Going to the Configuration Management");
        pages.invoicingPage.configurationManagement.click();

        extentLogger.info("Going yo the 'Configuration Payments'");
        pages.invoicingPage.configurationPayments.click();

        extentLogger.info("Going to the 'Payment Acquires' page");
        pages.invoicingPage.paymentAcquirers.click();

        Thread.sleep(5000);
        extentLogger.info("Clicking on'Create' button");
        pages.invoicingPage.createButton.click();

        extentLogger.info("Clicking on 'Configuration' button");
        Thread.sleep(3000);
        pages.configurationPage.configurationButton.click();

        extentLogger.info("Clicking on 'Payment Journal'");
//        BrowserUtilities.waitForClickablility(pages.configurationPage.paymentJournal);
        Thread.sleep(5000);
        pages.configurationPage.paymentJournal.click();


        extentLogger.info("Clicking on 'Action' dropdown");
        Thread.sleep(5000);
        pages.configurationPage.actionDropdown.click();

        System.out.println(pages.configurationPage.unpaidInvoicesInActDropdown.getText());
        pages.configurationPage.unpaidInvoicesInActDropdown.click();
        Thread.sleep(5000);
        pages.invoicingPage.createButton.click();
        pages.configurationPage.ACDvendorDropdwnInActDropdown.click();
        BrowserUtilities.waitForClickablility(pages.configurationPage.advancedSettings);
        pages.configurationPage.advancedSettings.click();
        pages.configurationPage.edit.click();

        pages.configurationPage.journalName.sendKeys("Banknot");
        Assert.assertEquals(pages.configurationPage.journalName, equals(pages.configurationPage.headerOnPopUpInNewPage));

        Select select = new Select(pages.configurationPage.typeInJournalName);
        System.out.println(pages.configurationPage.typeInJournalName.getText());


    }
}
