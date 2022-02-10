package pages;

import core.BasePage;
import helper.AssertHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class CreateProductsPage extends BasePage {
    @FindBy(id = "product-name")
    private WebElement tbName;
    @FindBy(id = "product-alias")
    private WebElement tbAlias;
    @FindBy(xpath = "//a[text() = 'Data']")
    private WebElement btnData;
    @FindBy(xpath = "//a[text() = 'General']")
    private WebElement btnGeneral;
    @FindBy(id = "product-image")
    private WebElement btnChooseFile;
    @FindBy(xpath = "//a[text() = 'Specifications']")
    private WebElement btnSpec;
    @FindBy(id = "product-sku")
    private WebElement tbSKU;
    @FindBy(id = "product-price")
    private WebElement tbPrice;
    @FindBy(id = "product-quantity")
    private WebElement tbQuantity;
    @FindBy(xpath = "//a[text() = 'Related']")
    private WebElement btnRelated;
    @FindBy(xpath = "(//ul[@class='select2-choices'])[1]")
    private WebElement tbCategories;
    @FindBy(xpath = "//div[text()='Desktops']")
    private WebElement slDesktops;
    @FindBy(id = "save")
    private WebElement btnSave;
    @FindBy(xpath = "//div[text()='Name cannot be blank.']")
    private WebElement messName;
    @FindBy(xpath = "//div[@class= 'help-block help-block-error '][1]")
    private WebElement messName1;
    @FindBy(xpath = "//div[@class='form-group field-product-image required has-error']//div//div")
    private WebElement messImage;
    @FindBy(xpath = "//div[contains(text(),'Image cannot be blank.']")
    private WebElement messImage1;

    public void verifyNameRequiredFieldInProductsPage(String alias, String fileImage, double SKU, double price, double quantity, String categories) {
        tbAlias.sendKeys(alias);
        btnData.click();
        btnChooseFile.sendKeys(new File(fileImage).getAbsolutePath());
        btnSpec.click();
        tbSKU.sendKeys(Integer.toString((int) SKU));
        tbPrice.sendKeys(Integer.toString((int) price));
        tbQuantity.sendKeys(Integer.toString((int) quantity));
        btnRelated.click();
        tbCategories.click();
        slDesktops.click();
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.TAB).perform();
        btnGeneral.click();
        btnSave.click();
        AssertHelper.checkMess(messName, "Name cannot be blank.");
    }

    public void verifyImageRequiredFieldInProductsPage(String name, String alias, double SKU, double price, double quantity, String categories) throws InterruptedException {
        tbAlias.sendKeys(alias);
        tbName.sendKeys(name);
        btnSpec.click();
        tbSKU.sendKeys(Integer.toString((int) SKU));
        tbPrice.sendKeys(Integer.toString((int) price));
        tbQuantity.sendKeys(Integer.toString((int) quantity));
        btnRelated.click();
        tbCategories.click();
        slDesktops.click();
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.TAB).perform();
        //btnSave.click();
        btnData.click();
        // actions.moveToElement(btnSave).click().build().perform();
        btnSave.click();

        System.out.println(messImage.getText());
        AssertHelper.checkMess(messImage, "Image cannot be blank.");


    }
}
