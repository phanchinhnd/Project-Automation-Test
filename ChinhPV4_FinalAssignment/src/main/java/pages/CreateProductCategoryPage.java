package pages;

import core.BasePage;
import helper.AssertHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class CreateProductCategoryPage extends BasePage {
    @FindBy(id = "productcategory-name")
    private WebElement tbName;
    @FindBy(id = "productcategory-alias")
    private WebElement tbAlias;
    @FindBy(id = "productcategory-image")
    private WebElement btnChooseFile;
    @FindBy(id = "productcategory-code")
    private WebElement tbCode;
    @FindBy(id = "save")
    private WebElement btnSave;
    @FindBy(xpath = "//div[text() = 'Name cannot be blank.']")
    private WebElement messName;
    @FindBy(xpath = "//div[text() = 'Image cannot be blank.']")
    private WebElement messImage;
    @FindBy(xpath = "//div[text() = 'Code cannot be blank.']")
    private WebElement messCode;
    public void verifyNameRequiredFieldInProductCategoriesPage(String alias, String fileImage, double code){
        tbAlias.sendKeys(alias);
        btnChooseFile.sendKeys(new File(fileImage).getAbsolutePath());
        tbCode.sendKeys(Integer.toString((int) code));
        btnSave.click();
        AssertHelper.checkDisplay(messName, "The message name not display");
    }
    public void verifyImageRequiredFieldInProductCategoriesPage(String name, String alias, double code){
        tbAlias.sendKeys(alias);
        tbName.sendKeys(name);
        tbCode.sendKeys(Integer.toString((int) code));
        btnSave.click();
        AssertHelper.checkDisplay(messImage,"The message image not display");
    }
    public void verifyCodeRequiredFieldInProductCategoriesPage(String name, String alias, String fileImage){
        tbAlias.sendKeys(alias);
        tbName.sendKeys(name);
        btnChooseFile.sendKeys(new File(fileImage).getAbsolutePath());
        btnSave.click();
        AssertHelper.checkDisplay(messCode,"The message code not display");
    }
}
