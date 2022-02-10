package core;

import helper.AssertHelper;
import helper.DriverHelper;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class BaseTest {
    public static final String URL_LOGIN = "http://demo.whatacart.com/backend";
    @BeforeClass
    @Parameters("browser")
    public static void setDriver(String browser) {
        //DriverHelper.getInstance().driverHelper(browser);
        DriverHelper.getInstance().driverHelper(browser).get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
    }

    @AfterClass
    public static void closeBrowser(ITestResult result) {
        DriverHelper.getInstance().getWebDriver().close();
        //DriverHelper.getInstance().getWebDriver().remove();
    }
}
