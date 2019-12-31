package com.Odoo.step_definitions;

import com.Odoo.pages.CalendarPage;
import com.Odoo.pages.LoginPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.ConfigurationReader;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.Map;

public class LoginPageStepDefinitions {

    LoginPage loginPage = new LoginPage();
    CalendarPage calendarPage = new CalendarPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the home page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.waitForClickablility(loginPage.signinButton, 5);
        loginPage.signinButton.click();
    }

    @Then("user enters")
    public void user_enters(Map<String, String> dataTable) {
        System.out.println("I am on the login page");
        loginPage.login(dataTable.get("username"), dataTable.get("password"));
    }

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String pageSubTitle) {
        BrowserUtils.waitForVisibility(loginPage.pageSubTitle, 15);
        Assert.assertTrue(loginPage.pageSubTitle.isDisplayed());
        Assert.assertEquals(loginPage.pageSubTitle.getText(), pageSubTitle);
        System.out.println("I am on the " + loginPage.getPageSubTitle() + " page!");
    }


}

