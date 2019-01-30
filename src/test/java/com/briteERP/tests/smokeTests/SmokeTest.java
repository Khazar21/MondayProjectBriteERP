package com.briteERP.tests.smokeTests;

import com.briteERP.pages.SignInPage;
import com.briteERP.utilities.TestBase;
import org.testng.annotations.Test;

public class SmokeTest extends TestBase{
    @Test
    public void smokeTest(){
    pages.odooPage.briteERPDemo.click();
    pages.signInPage.signIn();
    pages.menuUser.invoicing.click();
    }

}
