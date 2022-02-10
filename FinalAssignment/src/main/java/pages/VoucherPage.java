package pages;

import core.AppiumBase;
import helper.ScrollHelper;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class VoucherPage extends AppiumBase {
    public VoucherPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text ='Voucher gà rán Lotteria']")
    private WebElement btnLProduct;
    @AndroidFindBy(xpath = "com.nct.shopiness:id/vp_content")
    private WebElement btnMainContainer;
    @AndroidFindBy(id = "com.nct.shopiness:id/imgView")
    private WebElement image;
    @AndroidFindBy(id = "com.nct.shopiness:id/tv_description")
    private WebElement description;
    @AndroidFindBy(xpath = "(//android.widget.Button)[1]")
    private WebElement btnMuaNgay;
    @AndroidFindBy(xpath = "(//android.widget.Button)[2]")
    private WebElement btnCarticon;
    @AndroidFindBy(xpath = "(//*[@resource-id='com.nct.shopiness:id/cvDealCard'])[last()]")
    private WebElement lastVoucher;
    @AndroidFindBy(id = "android:id/text1")
    private WebElement hint;
    public void gotoLProduct() {
        try {
            hint.click();
        } catch (Exception e) {
        } finally {
            scrollToBottom();
        }
    }

    public void verifyLProduct() {
        wait.until(ExpectedConditions.visibilityOf(image));
        Assert.assertTrue(image.isDisplayed(), "image not display");
        Assert.assertTrue(description.isDisplayed(), "description not display");
        Assert.assertTrue(btnMuaNgay.isDisplayed(), "mua ngay not display");
        Assert.assertTrue(btnCarticon.isDisplayed(), "carticon not display");
    }
    public void scrollToBottom() {
        String start;
        String end;
        do {
            start = driver.getPageSource();
            ScrollHelper.swipeUp();
            end = driver.getPageSource();
            if (start.equals(end)) {
                lastVoucher.click();
            }
        }while (!start.equals(end));
    }
}
