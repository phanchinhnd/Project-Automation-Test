package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class UuDaiPage extends AppiumBase {
    public UuDaiPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.nct.shopiness:id/imageView_deal'])[1]")
    private WebElement btnFProduct;
    @AndroidFindBy(id = "com.nct.shopiness:id/deal_image_view")
    private WebElement imageDiscount;
    @AndroidFindBy(id = "com.nct.shopiness:id/rating_criteria_text_view")
    private WebElement descriptionDiscount;
    @AndroidFindBy(xpath = "(//android.widget.Button)[1]")
    private WebElement btnMuaNhanHang;

    public void gotoFProduct(){
        wait.until(ExpectedConditions.visibilityOf(btnFProduct));
        btnFProduct.click();
        btnFProduct.click();
    }
    public void verifyFProduct(){
        wait.until(ExpectedConditions.visibilityOf(imageDiscount));
        Assert.assertTrue(imageDiscount.isDisplayed(),"image not displayed");
        Assert.assertTrue(descriptionDiscount.isDisplayed(),"description not displayed");
        Assert.assertTrue(btnMuaNhanHang.isDisplayed(),"button Mua ban not displayed");
    }
}
