package com.Odoo.pages;

import com.Odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateSalesChannelPage extends BasePage{
    @FindBy(css = ".o_field_char.o_field_widget.o_input.o_required_modifier[name='name']")
    public WebElement salesTeamNameWebElement;

    @FindBy(css = ".o_input.ui-autocomplete-input#o_field_input_1165 ")
    public WebElement channelLeaderWebElement;

    @FindBy(css = ".o_field_char.o_field_widget.o_input.oe_inline#o_field_input_1166")
    public WebElement emailWebElement;

    public void enterInformation(){

    }


    public void navigateToSalesChannels() {
        String path = "a[href='/web#menu_id=267&action=242']";

        WebDriverWait wait = new WebDriverWait(Driver.get(), 30);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));

        WebElement module = Driver.get().findElement(By.cssSelector(path));
        wait.until(ExpectedConditions.visibilityOf(module));
        wait.until(ExpectedConditions.elementToBeClickable(module));

        waitUntilLoaderDisappear();

        module.click();


    }

    public void navigateToCRM() {
        String path = "a[href='/web#menu_id=261&action=365']";

        WebDriverWait wait = new WebDriverWait(Driver.get(), 30);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));

        WebElement module = Driver.get().findElement(By.cssSelector(path));
        wait.until(ExpectedConditions.visibilityOf(module));
        wait.until(ExpectedConditions.elementToBeClickable(module));

        waitUntilLoaderDisappear();

        module.click();


    }

}
