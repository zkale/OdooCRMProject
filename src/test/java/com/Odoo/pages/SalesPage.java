package com.Odoo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesPage extends BasePage {

    @FindBy(xpath = "(//*[contains(text(), 'Sales')])[2]")
    public WebElement sales;




}
