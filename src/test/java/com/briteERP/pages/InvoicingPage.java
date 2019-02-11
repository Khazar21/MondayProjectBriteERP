package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;

public class InvoicingPage {
    public InvoicingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "o_sub_menu_logo")
    public WebElement logo;
    @FindBy(xpath = "//a[@data-menu='201']")
    public WebElement salesDocuments;
    @FindBy(xpath = "//a[@data-menu='239']")
    public WebElement customerInvoices;
    @FindBy(xpath = "//a[@data-menu='240']")
    public WebElement customerCreditNotes;
    @FindBy(xpath = "//a[@data-menu='223']")
    public WebElement salesPayments;
    @FindBy(xpath = "//a[@data-menu='203']")
    public WebElement salesMasterData;
    @FindBy(xpath = "//a[@data-menu='233']")
    public WebElement customers;
    @FindBy(xpath = "//a[@data-menu='234']")
    public WebElement sellableProducts;
    @FindBy(xpath = "//a[@data-menu='205']")
    public WebElement purchasesDocuments;
    @FindBy(xpath = "//a[@data-menu='241']")
    public WebElement vendorBills;
    @FindBy(xpath = "//a[@data-menu='242']")
    public WebElement vendorCreditNotes;
    @FindBy(xpath = "//a[@data-menu='224']")
    public WebElement purchasesPayments;
    @FindBy(xpath = "//a[@data-menu='206']")
    public WebElement purchasesMasterData;
    @FindBy(xpath = "//a[@data-menu='236']")
    public WebElement vendors;
    @FindBy(xpath = "//a[@data-menu='235']")
    public WebElement purchasableProducts;
    @FindBy(xpath = "//a[@data-menu='213']")
    public WebElement reportingManagement;
    @FindBy(xpath = "//a[@data-menu='216']")
    public WebElement pdfReports;
    @FindBy(xpath = "//a[@data-menu='248']")
    public WebElement invoices;
    @FindBy(xpath = "//a[@data-menu='250']")
    public WebElement journalsAudit;
    @FindBy(xpath = "//a[@data-menu='257']")
    public WebElement agedPartnerBalance;
    @FindBy(xpath = "//a[@data-menu='256']")
    public WebElement taxReport;
    @FindBy(xpath = "//a[@data-menu='218']")
    public WebElement accounting;
    @FindBy(xpath = "//a[@data-menu='229']")
    public WebElement taxes;
    @FindBy(xpath = "//a[@data-menu='243']")
    public WebElement fiscalPositions;
    @FindBy(xpath = "//a[@data-menu='226']")
    public WebElement bankAccounts;
    @FindBy(xpath = "//a[@data-menu='227']")
    public WebElement journals;
    @FindBy(xpath = "//a[@data-menu='219']")
    public WebElement configurationManagement;
    @FindBy(xpath = "//a[@data-menu='232']")
    public WebElement paymentTerms;
    @FindBy(xpath = "//a[@data-menu='440']")
    public WebElement configurationPayments;
    @FindBy(xpath = "//a[@data-menu='441']")
    public WebElement paymentAcquirers;
    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchInput;
    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createButton;
    @FindBy(xpath = "//div[@class='o_form_sheet']")
    public WebElement draftCreditNoteSheet;
    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input'][1]")
    public WebElement draftCreditNoteVendor;
    @FindBy(xpath = "//div[@class='modal-body']")
    public WebElement paymentWarningMessage;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement paymentCreateButton;
    @FindBy(xpath = "(//li[@class='ui-menu-item']//a)[13]")
    public WebElement productComputerCase;
    @FindBy(xpath = "(//td[@class='o_data_cell o_list_text o_required_modifier']//textarea)[1]")
    public WebElement productDescription;
    @FindBy(xpath = "(//td[@class='o_data_cell o_list_number o_required_modifier'])[1]")
    public WebElement productQuantity;
    @FindBy(xpath = "(//td[@class='o_data_cell o_list_number o_required_modifier'])[2]")
    public WebElement productUnitPrice;
    @FindBy(xpath = "//td[@class='o_data_cell o_list_number o_readonly_modifier']")
    public WebElement productAmount;

    @FindBy(xpath = "//td[@class='o_list_record_delete']//button")
    public WebElement productDelete;

    @FindBy(xpath = "(//div[@class='o_radio_item']//input)[3]")
    public WebElement paymentTypeInternalTransfer;


    @FindBy(xpath = "//button[contains(text(),'Discard')]")
    public WebElement paymentDiscardButton;

    @FindBy(xpath = "//table[@class='o_group o_inner_group o_group_col_6']/../..")
    public WebElement paymentSheet;
    @FindBy(xpath = "//input[@name='payment_date']")
    public WebElement paymentDate;
    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[4]/a")
    public WebElement draftCreditNoteVendor1;

    @FindBy(xpath = "(//td[@class='o_field_x2many_list_row_add']//a)[1]")
    public WebElement vendorCreditNoteAddAnItem;

    @FindBy(xpath = "//div[@name='product_id']//div")
    public WebElement addAnItemInput;

    @FindBy(xpath = "(//li[@class='o_m2o_dropdown_option ui-menu-item']//a)[1]")
    public WebElement searchMore;

    @FindBy(xpath = "(//li[@class='o_m2o_dropdown_option ui-menu-item']//a)[2]")
    public WebElement creditAndEdit;

    @FindBy(xpath = "//button[contains(text(),'Import')]")
    public WebElement importButton;
    @FindBy(xpath = "//button[@data-view-type='list']")
    public WebElement listView;
    @FindBy(xpath = "//button[@data-view-type='kanban']")
    public WebElement kanbanView;
    @FindBy(xpath = "//button[@data-view-type='calendar']")
    public WebElement calendarView;
    @FindBy(xpath = "//button[@data-view-type='pivot']")
    public WebElement pivotView;
    @FindBy(xpath = "//button[@data-view-type='graph']")
    public WebElement graphicView;
    @FindBy(xpath = "//span[@class='o_pager_value']")
    public WebElement listViewCounts;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm dropdown-toggle']")
    public WebElement measuresDropDown;
    @FindBy(xpath = "//button[@data-mode='bar']")
    public WebElement barChart;
    @FindBy(xpath = "//button[@data-mode='line']")
    public WebElement lineChart;
    @FindBy(xpath = "//button[@data-mode='pie']")
    public WebElement pieChart;
    @FindBy(xpath = "//ol[@class='breadcrumb']//li")
    public WebElement pageHeader;
    @FindBy(xpath = "//span[.='Cancel']/..")
    public WebElement cancelButton;
    @FindBy(tagName = "h4")
    public WebElement popUpWindowHeader;
    @FindBy(xpath = "(//label[.='Electronic']/../..//input)[1]")
    public WebElement debitMethodsManualCB;
    @FindBy(xpath = "//label[.='Electronic']/..//input")
    public WebElement debitMethodsElectronicCB;
    @FindBy(xpath = "//label[.='Checks']/../..//input")
    public WebElement paymentMethodsManualCB;
    @FindBy(xpath = "//label[.='Checks']/..//input")
    public WebElement paymentMethodsChecksCB;
    @FindBy(xpath = "//div[@class='o_facet_values']")
    public WebElement canbesold;
    @FindBy(xpath = "(//img[@modifiers='{}'])[1]")
    public WebElement pictureRandom;


    public boolean elementDisplayed(WebElement element) {
        // try find it
        // if cant find it, return false
        try {
            return element.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }

    }


}
