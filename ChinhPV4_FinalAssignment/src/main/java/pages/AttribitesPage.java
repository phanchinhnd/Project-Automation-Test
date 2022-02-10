package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AttribitesPage extends BasePage {
    @FindBy(id = "action-toolbar-create")
    private WebElement btnCreate;

    public void gotoCreateAttribites() {
        btnCreate.click();
    }
}
