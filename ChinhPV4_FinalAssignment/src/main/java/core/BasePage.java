package core;

import helper.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriverWait w;
    public BasePage() {
        PageFactory.initElements(getDriver(),this);
        w = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }
    public WebDriver getDriver(){
        return DriverHelper.getInstance().getWebDriver();
    }
}
