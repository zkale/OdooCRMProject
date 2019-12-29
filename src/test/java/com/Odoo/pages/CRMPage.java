package com.Odoo.pages;

import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CRMPage extends BasePage
{

    @FindBy(linkText = "CRM")
    public WebElement crm;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li")
    public WebElement header;

    @FindBy(css="[class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createButton;




    public void navigateToCRMPage()
    {
        BrowserUtils.waitForVisibility(crm,5);
        BrowserUtils.waitForClickablility(crm,10);
        crm.click();
        BrowserUtils.wait(5);
    }

    public void createNewPipeline(String str)
    {

        BrowserUtils.waitForVisibility(createButton,5);
        BrowserUtils.waitForClickablility(createButton,10);
        createButton.click();
        BrowserUtils.wait(3);
        WebElement op= Driver.get().findElement(By.cssSelector("[class='o_field_char o_field_widget o_input o_required_modifier']"));
        op.sendKeys(str);
        WebElement cu=Driver.get().findElement(By.cssSelector("[class='o_input ui-autocomplete-input']"));
        cu.sendKeys(str);
        BrowserUtils.wait(3);
        Driver.get().findElement(By.xpath("//li[starts-with(@id, 'ui-id')]")).click();
        WebElement er=Driver.get().findElement(By.cssSelector("[class='o_field_float o_field_number o_field_widget o_input']"));
        er.clear();
        er.sendKeys("1000");
        Driver.get().findElement(By.cssSelector("[class='btn btn-sm btn-primary']")).click();
        BrowserUtils.wait(5);
    }
}
