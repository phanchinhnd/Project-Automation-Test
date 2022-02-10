package tests;

import core.BaseTest;
import helper.Excelhelper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductCategoriesPage;
import pages.ProductsPage;

public class TC_05_VerifyProductsPage extends BaseTest {
    @Test(dataProvider = "getData",description = "verifyProductCategoriesPage",groups = "")
    public void verifyProductCategoriesPage (String user, String pass)  {
        LoginPage loginPage = new LoginPage();
        loginPage.verifyLoginSuccessfully(user,pass);
        HomePage homePage = new HomePage();
        homePage.gotoProductPage();
        ProductsPage productsPage = new ProductsPage();
        productsPage.verifyProductsPage();
    }
    @DataProvider
    public Object[][] getData(){
        return Excelhelper.data("TC_02_03_05_08");
    }
}
