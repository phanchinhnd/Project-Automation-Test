package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.LinkedList;

public class HomePage extends AppiumBase {
    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    private WebElement operatorAdd;

    public void clickNumber(int number) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (number > 0) {
            stack.push(number % 10);
            number = number / 10;
        }
        while (!stack.isEmpty()) {
            WebElement numberFull = driver.findElement(By.id(String.format("com.google.android.calculator:id/digit_%s", stack.pop())));
            wait.until(ExpectedConditions.visibilityOf(numberFull));
            numberFull.click();
        }
    }

    public void sumTotal(int numberTo, int numberFrom) {
        for (int i = numberTo; i <= numberFrom; i++) {
            if(i < numberFrom){
                clickNumber(i);
                operatorAdd.click();
            }else {
                clickNumber(i);
            }
        }
    }
}
