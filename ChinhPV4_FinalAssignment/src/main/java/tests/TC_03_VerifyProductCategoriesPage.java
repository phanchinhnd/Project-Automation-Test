package tests;

import core.BaseTest;
import helper.Excelhelper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductCategoriesPage;

public class TC_03_VerifyProductCategoriesPage extends BaseTest {
    @Test(dataProvider = "getData",description = "verifyProductCategoriesPage",groups = "")
    public void verifyProductCategoriesPage (String user, String pass){
        LoginPage loginPage = new LoginPage();
        loginPage.verifyLoginSuccessfully(user,pass);
        HomePage homePage = new HomePage();
        homePage.gotoProductCategoriesPage();
        ProductCategoriesPage productCategoriesPage = new ProductCategoriesPage();
        productCategoriesPage.verifyProductCategoriesPage();
    }
    @DataProvider
    public Object[][] getData(){
        return Excelhelper.data("TC_02_03_05_08");
    }
}
