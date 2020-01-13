package com.Odoo.step_definitions;

import com.Odoo.pages.LoginPage;
import com.Odoo.pages.SalesPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class SalesStepDefinitions {
    LoginPage loginPage = new LoginPage();
    SalesPage SalesPage = new SalesPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.get();

    @Then("user clicks on the Sales module on the panel")
    public void user_clicks_on_the_Sales_module_on_the_panel() {
        loginPage.waitUntilLoaderDisappear();

    }

    @Then("user verifies that Quotations subtitle is displayed")
    public void user_verifies_that_Quotations_subtitle_is_displayed(String pageSubTitle) {
        SalesPage.waitUntilLoaderDisappear();
        BrowserUtils.waitForPageToLoad(15);
        BrowserUtils.waitForVisibility(SalesPage.sales, 10);
        Assert.assertTrue(SalesPage.pageSubTitle.isDisplayed());
        Assert.assertEquals(pageSubTitle, SalesPage.pageSubTitle.getText());
        System.out.println("I am on the " + SalesPage.getPageSubTitle() + " page!");
    }

}
