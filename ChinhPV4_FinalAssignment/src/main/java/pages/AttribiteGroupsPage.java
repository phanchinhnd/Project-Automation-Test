package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AttribiteGroupsPage extends BasePage {
    @FindBy(id = "action-toolbar-create")
    private WebElement btnCreate;

    public void gotoCreateAttributeGroup() {
        btnCreate.click();
    }
}
