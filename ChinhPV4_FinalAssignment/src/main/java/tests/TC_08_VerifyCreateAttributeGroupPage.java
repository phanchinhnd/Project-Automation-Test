package tests;

import core.BaseTest;
import helper.Excelhelper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;

public class TC_08_VerifyCreateAttributeGroupPage extends BaseTest {
    @Test(dataProvider = "getData",description = "verifyProductCategoriesPage",groups = "")
    public void verifyCreateAttributeGroupPage (String user, String pass) {
        LoginPage loginPage = new LoginPage();
        loginPage.verifyLoginSuccessfully(user,pass);
        HomePage homePage = new HomePage();
        homePage.gotoAttribiteGroupsPage();
        AttribiteGroupsPage attribiteGroupsPage = new AttribiteGroupsPage();
        attribiteGroupsPage.gotoCreateAttributeGroup();
        CreateAttribiteGroupsPage createAttribiteGroupsPage = new CreateAttribiteGroupsPage();
        createAttribiteGroupsPage.verifyCreateAttributeGroupPage();
    }
    @DataProvider
    public Object[][] getData(){
        return Excelhelper.data("TC_02_03_05_08");
    }
}
