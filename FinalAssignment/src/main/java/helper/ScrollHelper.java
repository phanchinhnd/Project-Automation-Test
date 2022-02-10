package helper;

import core.AppiumBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class ScrollHelper extends AppiumBase{
    public static void swipe(int startx, int starty, int endx, int endy) {

        new TouchAction(driver).longPress(PointOption.point(startx, starty))

                .moveTo(PointOption.point(endx, endy))

                .release().perform();

    }
    public  static void swipeDown(){
        Dimension dimension = AppiumBase.driver.manage().window().getSize();
        int startY = (int) (dimension.getHeight()*0.2);
        int endY = (int) (dimension.getHeight()*0.8);
        int startX = (int) (dimension.getWidth()/2);
        swipe(startX,startY,startX,endY);
    }

    public static void swipeUp(){
        Dimension dimension = AppiumBase.driver.manage().window().getSize();
        int startY = (int) (dimension.getHeight()*0.8);
        int endY = (int) (dimension.getHeight()*0.2);
        int startX = (int) (dimension.getWidth()/2);
        swipe(startX,startY,startX,endY);
    }
    public static void swipeUpInContainer(By locator, WebElement androidElementContainer, int count) {
        boolean isVisible = checkElementDisplayed(locator);
        if (isVisible) {
            return;
        }
        int startx = 0;
        int starty = 0;
        int endx = 0;
        int endy = 0;

        startx = endx = androidElementContainer.getLocation().getX() + Math.round(androidElementContainer.getSize().getWidth() / 2);

        starty = (int) (androidElementContainer.getLocation().getY() + Math.round(0.8 * androidElementContainer.getSize().getHeight()));
        endy = (int) (androidElementContainer.getLocation().getY() + Math.round(0.2 * androidElementContainer.getSize().getHeight()));
        System.out.println(startx + "_" + starty + "_" + endx + "_" + endy);
        for (int i = 0; i < count; ++i) {
            swipe(startx, starty, endx, endy);
            isVisible = checkElementDisplayed(locator);
            if (isVisible) {
                break;
            }
        }
    }

    public static boolean checkElementDisplayed(By locator) {
        boolean isDisplay = false;
        AndroidElement androidElement = null;
        try {
            androidElement = (AndroidElement) driver.findElement(locator);
        } catch (Exception e) {

        }
        if (null != androidElement) {
            try {
                if (null != androidElement.getLocation()) {
                    int x = androidElement.getLocation().getX();
                    int y = androidElement.getLocation().getY();
                    Dimension windowSize = driver.manage().window().getSize();
                    String deviceScreenSize = "";

                    int yMaxScreen = (int) Math.round(windowSize.getHeight());
                    int xMaxScreen = (int) Math.round(windowSize.getWidth());
                    if (driver instanceof AndroidDriver) {
                        deviceScreenSize = StringUtils.substringBetween(driver.toString(), "deviceScreenSize=",
                                ",");
                    }
                    if (null != deviceScreenSize && !deviceScreenSize.equals("")) {
                        yMaxScreen = Integer.parseInt(deviceScreenSize.split("x")[1]);
                        xMaxScreen = Integer.parseInt(deviceScreenSize.split("x")[0]);
                    }
                    if (x >= 0 && x < xMaxScreen && y >= 0 && y < yMaxScreen) {

                        isDisplay = true;
                    }
                }
            } catch (Exception e) {

            }

        }
        return isDisplay;
    }
}
