package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CreateAttributePage extends BasePage {
    @FindBy(id = "productattribute-name")
    private WebElement tbAttributeName;
    @FindBy(id = "productattribute-sort_order")
    private WebElement tbSortOrder;
    @FindBy(xpath = "//div[@class ='select2-search']")
    private WebElement slAttributeGroup;
    @FindBy(id = "select2-chosen-1")
    private WebElement slAttributeGroup1;
    @FindBy(xpath = "//div[text()='Memory']")
    private WebElement chooseMemory;
    @FindBy(id = "save")
    private WebElement btnSave;
    @FindBy(xpath = "//tbody")
    private  WebElement table;
    public void verifyNewCreateAttribute(String name){
        tbAttributeName.sendKeys(name);
        slAttributeGroup1.click();
        chooseMemory.click();
        btnSave.click();
        boolean check = false;
        List<WebElement> row = table.findElements(By.tagName("tr"));
        for(int i = 0 ;i<row.size();i++){
            List<WebElement> col = row.get(i).findElements(By.xpath("td[2]"));
            List<WebElement> col1 = row.get(i).findElements(By.xpath("td[3]"));
            for(int j = 0; j< col.size();j++){
                String 	attributeName = col.get(j).getText();
                String  attributeGroup = col1.get(j).getText();
                System.out.println(attributeGroup +" "+attributeName);
                if(attributeName.equalsIgnoreCase(name) && attributeGroup.equalsIgnoreCase("Memory")) {
                    check = true;
                }
            }
        }
        if(check == false){
            Assert.assertTrue(false,"The Attribute Group Name is "+name+" don't display");
        }
    }
}
