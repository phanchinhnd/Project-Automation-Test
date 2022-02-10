package tests;

import core.BaseTest;
import helper.Excelhelper;
import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;

public class TC_10_VerifyNewCreateAttribute extends BaseTest {
    @Test(dataProvider = "getData", description = "verifyProductCategoriesPage", groups = "")
    public void verifyCreateAttributeGroupPage(String user, String pass, String name) {
        LoginPage loginPage = new LoginPage();
        loginPage.verifyLoginSuccessfully(user, pass);
        HomePage homePage = new HomePage();
        homePage.gotoAttribitePage();
        AttribitesPage attribitesPage = new AttribitesPage();
        attribitesPage.gotoCreateAttribites();
        CreateAttributePage createAttributePage = new CreateAttributePage();
        createAttributePage.verifyNewCreateAttribute(name);
    }

    @DataProvider
    public Object[][] getData() {
        return Excelhelper.data("TC_09_10");
    }
}
