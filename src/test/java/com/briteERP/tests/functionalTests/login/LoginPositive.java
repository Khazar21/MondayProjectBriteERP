package com.briteERP.tests.functionalTests.login;

import com.briteERP.utilities.TestBase;
import org.testng.annotations.Test;

public class LoginPositive extends TestBase {
    @Test
    public void positiveLogin(){
        extentLogger= report.createTest("Positive Login as a Manager");

        extentLogger.info("Choosing the database");
        pages.odooPage.briteERPDemo.click();
        extentLogger.info("Signing in with valid Manager credentials");
        pages.signInPage.signIn("manager");
    }
}
