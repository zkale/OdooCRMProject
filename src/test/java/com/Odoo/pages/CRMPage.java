package com.Odoo.pages;

import com.Odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CRMPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Add an item')]")
    public WebElement addAnItem;

    @FindBy(xpath = "//span[contains(text(),'Save  & Close')]")
    public WebElement saveAndCloseButton;

    @FindBy( xpath="//table [@class ='o_group o_inner_group o_group_col_6']//tr//td//input")
    public WebElement title;

    public void createAnOpportunity(String title, String customer, String revenue, String priority){
        for (int i=1;i<=4;i++) {
            String path = "//table [@class ='o_group o_inner_group o_group_col_6']//tr[" + i + "]//td[2]//input";
            switch (i) {
                case 1:
                    Driver.get().findElement(By.xpath(path)).sendKeys(title);
                    break;
                case 2:
                    Driver.get().findElement(By.xpath(path)).sendKeys(customer);
                    break;
                case 3:
                    Driver.get().findElement(By.xpath(path)).sendKeys(revenue);
                    break;
                case 4:
                    String pathPriority = "//table [@class ='o_group o_inner_group o_group_col_6']//tr[4]//div//a[@title='"+priority+"']";
                    Driver.get().findElement(By.xpath(pathPriority)).click();
                    break;
            }
        }


        }
    }




