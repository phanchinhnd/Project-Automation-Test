package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class ThuongHieuPage extends AppiumBase {
    public ThuongHieuPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy(id = "com.nct.shopiness:id/btn_follow")
    private WebElement btnBrand;
    @FindBys(@FindBy(id = "com.nct.shopiness:id/btn_follow"))
    private List<WebElement> countBrand;
    public void verifyBrand(){
        Assert.assertEquals(countBrand.size(),9,"don't display 9 brand");
    }
}
