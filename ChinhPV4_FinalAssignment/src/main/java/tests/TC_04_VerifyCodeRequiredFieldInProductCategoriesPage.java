package tests;

import core.BaseTest;
import helper.Excelhelper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CreateProductCategoryPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductCategoriesPage;

public class TC_04_VerifyCodeRequiredFieldInProductCategoriesPage extends BaseTest {
    @Test(dataProvider = "getData",description = "VerifyNameRequiredFieldInProductCategoriesPage",groups = "")
    public void verifyNameRequiredFieldInProductCategoriesPage (String user, String pass,String name, String alias, String fileImage){
        LoginPage loginPage = new LoginPage();
        loginPage.verifyLoginSuccessfully(user,pass);
        HomePage homePage = new HomePage();
        homePage.gotoProductCategoriesPage();
        ProductCategoriesPage productCategoriesPage = new ProductCategoriesPage();
        productCategoriesPage.gotoCreateProductCategoryPage();
        CreateProductCategoryPage createProductCategoryPage = new CreateProductCategoryPage();
        createProductCategoryPage.verifyCodeRequiredFieldInProductCategoriesPage(name,alias,fileImage);
    }
    @DataProvider
    public Object[][] getData(){
        return Excelhelper.data("TC_04");
    }
}
