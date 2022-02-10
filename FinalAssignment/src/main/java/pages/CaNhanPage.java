package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class CaNhanPage extends AppiumBase {
    public CaNhanPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text ='Mã ưu đãi']")
    private WebElement btnMaUuDai;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@text ='Ưu đãi'])[1]")
    private WebElement btnUuDai;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@text ='Voucher'])[1]")
    private WebElement btnVoucher;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@text ='Thương hiệu'])[1]")
    private WebElement btnThuongHieu;

    public void verifyUuDaiPage(){
        wait.until(ExpectedConditions.visibilityOf(btnMaUuDai));
        Assert.assertTrue(btnMaUuDai.isDisplayed(),"Ma uu dai not displayed");
        Assert.assertTrue(btnUuDai.isDisplayed(),"Uu dai not displayed");
        Assert.assertTrue(btnVoucher.isDisplayed(),"Voucher not displayed");
        Assert.assertTrue(btnThuongHieu.isDisplayed(),"Thuong hieu not displayed");
    }
}
