package com.briteERP.tests.smokeTests;

import com.briteERP.utilities.ApplicationConstants;
import com.briteERP.utilities.BrowserUtilities;
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
        BrowserUtilities.waitForClickablility(pages.menuUser.invoicing);
        pages.menuUser.invoicing.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.CUSTOMER_INVOICES);

        pages.invoicingPage.customerCreditNotes.click();
        BrowserUtilities.waitForTitleContains("Credit Notes");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.CUSTOMER_CREDIT_NOTES);

        pages.invoicingPage.salesPayments.click();
        BrowserUtilities.waitForTitleContains("Payments");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.PAYMENTS);

        pages.invoicingPage.salesMasterData.click();
        pages.invoicingPage.customers.click();
        BrowserUtilities.waitForTitleContains("Customers");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.CUSTOMERS);

        pages.invoicingPage.sellableProducts.click();
        BrowserUtilities.waitForTitleContains("Sellable");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.SELLABLE_PRODUCTS);

        pages.invoicingPage.purchasesDocuments.click();
        pages.invoicingPage.vendorBills.click();
        BrowserUtilities.waitForTitleContains("Bills");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.VENDOR_BILLS);

        pages.invoicingPage.vendorCreditNotes.click();
        BrowserUtilities.waitForTitleContains("Notes");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.VENDOR_CREDIT_NOTES);

        pages.invoicingPage.purchasesPayments.click();
        BrowserUtilities.waitForTitleContains("Payments");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.PAYMENTS);

        pages.invoicingPage.purchasesMasterData.click();
        pages.invoicingPage.vendors.click();
        BrowserUtilities.waitForTitleContains("Vendors");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.VENDORS);

        pages.invoicingPage.purchasableProducts.click();
        BrowserUtilities.waitForTitleContains("Purchasable");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.PURCHASABLE_PRODUCTS);

        pages.invoicingPage.reportingManagement.click();
        pages.invoicingPage.invoices.click();
        BrowserUtilities.waitForTitleContains("Invoices");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.INVOICES);

        pages.invoicingPage.pdfReports.click();
        pages.invoicingPage.journalsAudit.click();
        Assert.assertEquals(pages.invoicingPage.popUpWindowHeader.getText(), ApplicationConstants.JOURNALS_AUDIT);
        pages.invoicingPage.cancelButton.click();

        pages.invoicingPage.agedPartnerBalance.click();
        Assert.assertEquals(pages.invoicingPage.popUpWindowHeader.getText(), ApplicationConstants.AGED_PARTNER_BALANCE);
        pages.invoicingPage.cancelButton.click();

        pages.invoicingPage.taxReport.click();
        Assert.assertEquals(pages.invoicingPage.popUpWindowHeader.getText(), ApplicationConstants.TAX_REPORTS);
        pages.invoicingPage.cancelButton.click();

        pages.invoicingPage.accounting.click();
        pages.invoicingPage.taxes.click();
        BrowserUtilities.waitForTitleContains("Taxes");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.TAXES);

        pages.invoicingPage.fiscalPositions.click();
        BrowserUtilities.waitForTitleContains("Fiscal");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.FISCAL_POSITIONS);

        pages.invoicingPage.bankAccounts.click();
        BrowserUtilities.waitForTitleContains("Bank");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.BANK_ACCOUNTS);

        pages.invoicingPage.journals.click();
        BrowserUtilities.waitForTitleContains("Journals");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.JOURNALS);

        pages.invoicingPage.configurationManagement.click();
        pages.invoicingPage.paymentTerms.click();
        BrowserUtilities.waitForTitleContains("Terms");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.PAYMENT_TERMS);

        pages.invoicingPage.configurationPayments.click();
        pages.invoicingPage.paymentAcquirers.click();
        BrowserUtilities.waitForTitleContains("Acquirers");
        Assert.assertEquals(pages.invoicingPage.pageHeader.getText(), ApplicationConstants.PAYMENT_ACQUIRERS);

    }
}
