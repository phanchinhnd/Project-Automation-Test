package tests;

import core.BaseTest;
import helper.DriverHelper;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TC_01_VeryfyLoginPage extends BaseTest {
    @Test(description = "verify loginpage",groups = "")
    public void veryfyLoginPage(){
       // DriverHelper.getInstance().getWebDriver().get(URL_LOGIN);
        LoginPage loginPage = new LoginPage();
        loginPage.verifyLoginPage();
    }
}
