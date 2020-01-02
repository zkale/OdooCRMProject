package com.Odoo.step_definitions;

import com.Odoo.pages.CalendarPage;
import com.Odoo.pages.LoginPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.ConfigurationReader;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

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
        loginPage.waitUntilLoaderDisappear();
        BrowserUtils.waitForVisibility(loginPage.pageSubTitle, 15);
        Assert.assertTrue(loginPage.pageSubTitle.isDisplayed());
        Assert.assertEquals(pageSubTitle, loginPage.pageSubTitle.getText());
        System.out.println("I am on the " + loginPage.getPageSubTitle() + " page!");
    }

    @Given("user logs in as {string}")
    public void user_logs_in_as(String role) {
        System.out.println("User logs in as " + role);
    }

    @When("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.login(username, password);

    }

    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String expectedMessage) {
        String actualMessage = loginPage.warningMessage.getText().trim();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Then("user verifies that {string} warning message is displayed for {string}")
    public void user_verifies_that_warning_message_is_displayed_for(String expectedMessage, String fieldName) {
        String actualMessage ="";
        if(fieldName.equals("username")){
            actualMessage = loginPage.userNameInput.getAttribute("validationMessage");}
        else if (fieldName.equals("password")){
            actualMessage = loginPage.passwordInput.getAttribute("validationMessage");}
        System.out.println(actualMessage);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

}

