package helper;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertHelper {
    public static void checkDisplay(WebElement webElement,String mess){
        Assert.assertTrue(webElement.isDisplayed(), mess);
    }
    public static void checkMess(WebElement webElement, String text){
        Assert.assertEquals(webElement.getText(),text);
    }
}
