package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverHelper {
    private DriverHelper() {}
    private static DriverHelper instance = null;
    public static synchronized DriverHelper getInstance() {
        if (instance == null) {
            instance = new DriverHelper();
        }
        return instance;
    }

    private static ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();

    public void setWebDriver(WebDriver driver) {
        drivers.set(driver);
    }

    public WebDriver getWebDriver() {
        return drivers.get();
    }
    WebDriver driver;
    public synchronized WebDriver driverHelper(String browser) {
        if(browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
        driver.manage().window().maximize();
        setWebDriver(driver);
        return driver;
    }
}
