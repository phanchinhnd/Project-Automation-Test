package pages;

import core.BasePage;
import helper.AssertHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "loginform-username")
    private WebElement username;
    @FindBy(id = "loginform-password")
    private WebElement password;
    @FindBy(id = "loginform-rememberme")
    private WebElement remember;
    @FindBy(xpath = "//button[@type ='submit']")
    private WebElement signIn;

    public void verifyLoginPage(){
        AssertHelper.checkDisplay(username,"Username not display");
        AssertHelper.checkDisplay(password,"Password not display");
        AssertHelper.checkDisplay(remember,"Remember not display");
        AssertHelper.checkDisplay(signIn,"Sing in not display");
    }
    public void verifyLoginSuccessfully(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
        signIn.click();
    }
}
