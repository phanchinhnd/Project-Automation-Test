package tests;

import core.BaseTest;
import helper.DriverHelper;
import helper.Excelhelper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TC_02_VerifyLoginSuccessfully extends BaseTest {
    @Test(dataProvider = "getData",description = "loginpage success",groups = "")
    public void veryfyLoginSuccess(String user, String pass){
       // DriverHelper.getInstance().getWebDriver().get(URL_LOGIN);
        LoginPage loginPage = new LoginPage();
        loginPage.verifyLoginSuccessfully(user,pass);
        HomePage homePage = new HomePage();
        homePage.verifyDisplayTC02();
    }
    @DataProvider
    public Object[][] getData(){
        return Excelhelper.data("TC_02_03_05_08");
    }
}
