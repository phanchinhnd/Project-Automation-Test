package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CapNhatPage extends AppiumBase {
    public CapNhatPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy(id = "android:id/button2")
    private WebElement btnKhong;
    @AndroidFindBy(id = "com.nct.shopiness:id/btn_trai_nghiem")
    private WebElement btnTraiNghiem;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
    private WebElement btnDeny;
    public void pressKhongCapNhat(){
        wait.until(ExpectedConditions.visibilityOf(btnKhong));
        btnKhong.click();
        wait.until(ExpectedConditions.visibilityOf(btnTraiNghiem));
        btnTraiNghiem.click();
        wait.until(ExpectedConditions.visibilityOf(btnDeny));
        btnDeny.click();
    }
}
