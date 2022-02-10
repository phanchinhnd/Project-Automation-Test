package tests;

import core.BaseTest;
import helper.Excelhelper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CreateProductCategoryPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductCategoriesPage;

public class TC_03_2_VerifyImageRequiredFieldInProductCategoriesPage extends BaseTest {
    @Test(dataProvider = "getData",description = "VerifyNameRequiredFieldInProductCategoriesPage",groups = "")
    public void verifyNameRequiredFieldInProductCategoriesPage (String user, String pass,String name, String alias, double code){
        LoginPage loginPage = new LoginPage();
        loginPage.verifyLoginSuccessfully(user,pass);
        HomePage homePage = new HomePage();
        homePage.gotoProductCategoriesPage();
        ProductCategoriesPage productCategoriesPage = new ProductCategoriesPage();
        productCategoriesPage.gotoCreateProductCategoryPage();
        CreateProductCategoryPage createProductCategoryPage = new CreateProductCategoryPage();
        createProductCategoryPage.verifyImageRequiredFieldInProductCategoriesPage(name,alias,code);
    }
    @DataProvider
    public Object[][] getData(){
        return Excelhelper.data("TC_03_2");
    }
}
