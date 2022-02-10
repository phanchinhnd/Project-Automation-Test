package tests;

import core.BaseTest;
import helper.Excelhelper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CreateProductsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductsPage;

public class TC_07_VerifyImageRequiredFieldInProductsPage extends BaseTest {
    @Test(dataProvider = "getData",description = "verifyProductCategoriesPage",groups = "")
    public void verifyProductCategoriesPage (String user, String pass,String name,String alias,String fileImage,double SKU,double price,double quantity,String categories) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.verifyLoginSuccessfully(user,pass);
        HomePage homePage = new HomePage();
        homePage.gotoProductPage();
        ProductsPage productsPage = new ProductsPage();
        productsPage.gotoCreateProductsPage();
        CreateProductsPage createProductsPage = new CreateProductsPage();
        createProductsPage.verifyImageRequiredFieldInProductsPage(name, alias, SKU,price,quantity,categories);
    }
    @DataProvider
    public Object[][] getData(){
        return Excelhelper.data("TC_06_07");
    }
}
