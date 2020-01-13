package com.Odoo.step_definitions;

import com.Odoo.pages.CRMPage;

import com.Odoo.pages.LoginPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Map;

public class QuotationsStepDefinitions {

    LoginPage loginPage = new LoginPage();
    CRMPage crmPage = new CRMPage();

    @Given("user is logged in")
    public void user_is_logged_in() {
        loginPage.waitUntilLoaderDisappear();
        BrowserUtils.waitForVisibility(loginPage.pageSubTitle, 15);
        Assert.assertTrue(loginPage.pageSubTitle.isDisplayed());
        System.out.println("I am on the " + loginPage.getPageSubTitle() + " page!");
    }

    @Then("user navigates to {string}")
    public void user_navigates_to(String moduleName) {
        crmPage.navigateToModule(moduleName);
        crmPage.waitUntilLoaderDisappear();
    }

    @Then("user clicks on {string} button")
    public void user_clicks_on_button(String buttonName) {
        crmPage.clickOnButton(buttonName);
        crmPage.waitUntilLoaderDisappear();
    }

    @Then("user enters following information")
    public void user_enters_following_information() {
        BrowserUtils.waitForVisibility(crmPage.title, 15);
        crmPage.createAnOpportunity("Customer Deal", "Happy Customer", "10000", "High");
        BrowserUtils.wait(2);
    }

    @Then("user clicks on {string} button under Quotations")
    public void user_clicks_on_button_under_Quotations(String buttonName) {
        crmPage.clickOnButton(buttonName);
    }

    @Then("user clicks on {string} button on the menu")
    public void user_clicks_on_button_on_the_menu(String buttonName) {
        crmPage.clickOnMenuButton(buttonName);
    }


}
