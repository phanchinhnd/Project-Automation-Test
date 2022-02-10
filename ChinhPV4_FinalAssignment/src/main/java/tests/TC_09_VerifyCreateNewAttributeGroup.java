package tests;

import core.BaseTest;
import helper.Excelhelper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AttribiteGroupsPage;
import pages.CreateAttribiteGroupsPage;
import pages.HomePage;
import pages.LoginPage;

public class TC_09_VerifyCreateNewAttributeGroup extends BaseTest {
    @Test(dataProvider = "getData",description = "verifyProductCategoriesPage",groups = "")
    public void verifyCreateAttributeGroupPage (String user, String pass,String name) {
        LoginPage loginPage = new LoginPage();
        loginPage.verifyLoginSuccessfully(user,pass);
        HomePage homePage = new HomePage();
        homePage.gotoAttribiteGroupsPage();
        AttribiteGroupsPage attribiteGroupsPage = new AttribiteGroupsPage();
        attribiteGroupsPage.gotoCreateAttributeGroup();
        CreateAttribiteGroupsPage createAttribiteGroupsPage = new CreateAttribiteGroupsPage();
        createAttribiteGroupsPage.verifyCreateNewAttributeGroup(name);
    }
    @DataProvider
    public Object[][] getData(){
        return Excelhelper.data("TC_09_10");
    }
}
