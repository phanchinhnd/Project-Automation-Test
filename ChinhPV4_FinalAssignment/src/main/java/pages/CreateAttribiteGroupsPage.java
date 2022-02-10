package pages;

import core.BasePage;
import helper.AssertHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CreateAttribiteGroupsPage extends BasePage {
    @FindBy(id = "productattributegroup-name")
    private WebElement tbAttributeGroupName;
    @FindBy(id = "productattributegroup-sort_order")
    private WebElement tbSortOrder;
    @FindBy(xpath = "//tbody")
    private  WebElement table;
    @FindBy(id = "save")
    private WebElement btnSave;
    public void verifyCreateAttributeGroupPage() {
        AssertHelper.checkDisplay(tbAttributeGroupName,"Attributes Group name not display");
        AssertHelper.checkDisplay(tbSortOrder,"Sort oder not display");
    }
    public void verifyCreateNewAttributeGroup(String name){
        tbAttributeGroupName.sendKeys(name);
        btnSave.click();
        boolean check = false;
        List<WebElement> row = table.findElements(By.tagName("tr"));
        for(int i = 0 ;i<row.size();i++){
            List<WebElement> col = row.get(i).findElements(By.xpath("td[2]"));
            for(int j = 0; j< col.size();j++){
                String c = col.get(j).getText();
                if(c.equalsIgnoreCase(name)) {
                    check = true;
                }
            }
        }
        if(check == false){
            Assert.assertTrue(false,"The Attribute Group Name is "+name+" don't display");
        }
    }
}
