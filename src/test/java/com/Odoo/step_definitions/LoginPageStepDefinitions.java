package com.Odoo.step_definitions;

import com.Odoo.pages.LoginPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.ConfigurationReader;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.*;

public class LoginPageStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the home page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.waitForClickablility(loginPage.signinButton,5);
        loginPage.signinButton.click();
    }

    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String username, String password) {
        System.out.println("I am on the login page");
        loginPage.login(username, password);
    }

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        System.out.println("I am on the #Inbox-Odoo page!");
    }
}
