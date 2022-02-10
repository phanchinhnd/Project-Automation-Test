package pages;

import core.BasePage;
import helper.AssertHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[@class = 'sidebar']")
    private WebElement leftMenu;
    @FindBy(xpath = "(//table)[1]")
    private WebElement userTable;
    @FindBy(xpath = "(//table)[2]")
    private WebElement productTable;
    @FindBy(xpath = "(//table)[3]")
    private WebElement customerTable;
    @FindBy(xpath = "(//table)[4]")
    private WebElement orderTable;
    @FindBy(xpath = "//span[text()='Catalog']")
    private WebElement btnCatalog;
    @FindBy(xpath = "//span[text()='Product Categories']")
    private WebElement btnProductCategories;
    @FindBy(xpath = "//span[text()='Products']")
    private WebElement btnProducts;
    @FindBy(xpath = "//span[text()='Attribute Groups']")
    private WebElement btnAttributeGroups;
    @FindBy(xpath = "//span[text()='Attributes']")
    private WebElement btnAttribute;
    public void verifyDisplayTC02(){
        AssertHelper.checkDisplay(leftMenu, "Left menu not display");
        AssertHelper.checkDisplay(userTable, "User table not display");
        AssertHelper.checkDisplay(productTable,"Product table not display");
        AssertHelper.checkDisplay(customerTable,"Customer table not display");
        AssertHelper.checkDisplay(orderTable, "Order table not display");
    }
    public void gotoProductCategoriesPage(){
        btnCatalog.click();
        btnProductCategories.click();
    }
    public void gotoProductPage(){
        btnCatalog.click();
        btnProducts.click();
    }
    public void gotoAttribiteGroupsPage(){
        btnCatalog.click();
        btnAttributeGroups.click();
    }
    public void gotoAttribitePage(){
        btnCatalog.click();
        btnAttribute.click();
    }
}
