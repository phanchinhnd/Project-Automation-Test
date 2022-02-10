package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class NapDienThoaiPage extends AppiumBase {
    public NapDienThoaiPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBys(@FindBy(id = "com.nct.shopiness:id/img"))
    private List<WebElement> logo;
    @FindBys(@FindBy(id = "com.nct.shopiness:id/text_view"))
    private List<WebElement> giatien;
    @AndroidFindBy(xpath = "//*[@text='20.000đ']")
    private WebElement haimuoni;
    @AndroidFindBy(xpath = "//*[@text='50.000đ']")
    private WebElement nammuoi;
    @AndroidFindBy(xpath = "//*[@text='100.000đ']")
    private WebElement mottram;
    @AndroidFindBy(xpath = "//*[@text='200.000đ']")
    private WebElement haitram;
    @AndroidFindBy(xpath = "//*[@text='300.000đ']")
    private WebElement batram;
    @AndroidFindBy(xpath = "//*[@text='500.000đ']")
    private WebElement namtram;

    public void verifyNapDienThoai(DataTable dataTable) {
        List<Map<String,String>> ls = dataTable.asMaps();
        Assert.assertEquals(String.valueOf(logo.size()), ls.get(0).get("Display"), "don't display 4 logo");
        Assert.assertEquals(haimuoni.getAttribute("text"),ls.get(1).get("Display"));
        Assert.assertEquals(nammuoi.getAttribute("text"),ls.get(2).get("Display"));
        Assert.assertEquals(mottram.getAttribute("text"),ls.get(3).get("Display"));
        Assert.assertEquals(haitram.getAttribute("text"),ls.get(4).get("Display"));
        Assert.assertEquals(batram.getAttribute("text"),ls.get(5).get("Display"));
        Assert.assertEquals(namtram.getAttribute("text"),ls.get(6).get("Display"));
    }
}
