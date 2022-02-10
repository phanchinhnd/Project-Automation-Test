package pages;


import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends AppiumBase {
    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.nct.shopiness:id/icn_giohang")
    private WebElement btnCartIcon;
    @AndroidFindBy(id = "com.nct.shopiness:id/menu_item_search")
    private WebElement btnSearchIcon;
    @AndroidFindBy(id = "com.nct.shopiness:id/btn_try_cash_back")
    private WebElement btnBatDauNgay;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Hoàn tiền']")
    private WebElement btnHoanTien;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Thương hiệu']")
    private WebElement btnThuongHieu;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Ưu đãi']")
    private WebElement btnUuDai;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Voucher']")
    private WebElement btnVoucher;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Cá nhân']")
    private WebElement btnCaNhan;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id ='com.nct.shopiness:id/tv_title'])[1]")
    private WebElement btnNapDienThoai;
    public void verìfyHomePage() {
        wait.until(ExpectedConditions.visibilityOf(btnCartIcon));
        Assert.assertTrue(btnCartIcon.isDisplayed(),"Cart icon not displayed");
        wait.until(ExpectedConditions.visibilityOf(btnSearchIcon));
        Assert.assertTrue(btnSearchIcon.isDisplayed(),"Search icon not displayed");
        wait.until(ExpectedConditions.visibilityOf(btnBatDauNgay));
        Assert.assertTrue(btnBatDauNgay.isDisplayed(),"Bat dau ngay not displayed");
        wait.until(ExpectedConditions.visibilityOf(btnHoanTien));
        Assert.assertTrue(btnHoanTien.isDisplayed(),"Hoan tien not displayed");
        Assert.assertTrue(btnThuongHieu.isDisplayed(),"Thuong hieu not displayed");
        Assert.assertTrue(btnUuDai.isDisplayed(),"Uu dai not displayed");
        Assert.assertTrue(btnVoucher.isDisplayed(),"Voucher not displayed");
        Assert.assertTrue(btnCaNhan.isDisplayed(),"Ca nhan not displayed");
    }
    public void gotoThuongHieu(){
        wait.until(ExpectedConditions.visibilityOf(btnThuongHieu));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(btnThuongHieu).doubleClick().perform();
        btnThuongHieu.click();
        btnThuongHieu.click();
    }
    public void gotoUuDai(){
        wait.until(ExpectedConditions.visibilityOf(btnUuDai));
        btnUuDai.click();
        btnUuDai.click();
    }
    public void gotoVoucher(){
        wait.until(ExpectedConditions.visibilityOf(btnVoucher));
        btnVoucher.click();
        btnVoucher.click();
    }
    public void gotoCaNhan(){
        wait.until(ExpectedConditions.visibilityOf(btnCaNhan));
        btnCaNhan.click();
        btnCaNhan.click();
    }
    public void gotoNapDienThoai(){
        wait.until(ExpectedConditions.visibilityOf(btnNapDienThoai));
        btnNapDienThoai.click();
        btnNapDienThoai.click();
    }
}
