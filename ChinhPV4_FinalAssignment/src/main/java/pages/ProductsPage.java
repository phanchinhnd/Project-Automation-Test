package pages;

import core.BasePage;
import helper.AssertHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
    @FindBy(id = "action-toolbar-create")
    private WebElement btnCreate;
    @FindBy(id = "grid-settings-form")
    private WebElement btnSetting;
    @FindBy(id = "action-toolbar-bulkdelete")
    private WebElement btnDelete;
    @FindBy(id = "action-toolbar-bulkedit")
    private WebElement btnEdit;
    @FindBy(xpath = "//table")
    private WebElement table;

    public void verifyProductsPage() {
        AssertHelper.checkDisplay(btnCreate,"Button create not display");
        AssertHelper.checkDisplay(btnDelete,"Button delete not display");
        AssertHelper.checkDisplay(btnEdit,"Button Edit not display");
        AssertHelper.checkDisplay(btnSetting,"Button Setting not display");
        AssertHelper.checkDisplay(table,"Table not display");
    }
    public void gotoCreateProductsPage(){
        btnCreate.click();
    }
}
