package com.Odoo.pages;

import com.Odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[2]")
    public WebElement calendar;

    @FindBy(css = "button[class$='default active']")
    public WebElement weekButton;



}
