package core;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBase {
    public static AndroidDriver driver;
    public static WebDriverWait wait;

    public void crateDriver() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("udid", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "com.nct.shopiness");
        desiredCapabilities.setCapability("appActivity", ".ui.activities.intro.SplashActivity");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        //desiredCapabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
        wait = new WebDriverWait(driver, 60);
    }
    public void teaDown(){
        driver.closeApp();
    }
}
