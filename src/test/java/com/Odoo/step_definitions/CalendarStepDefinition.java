package com.Odoo.step_definitions;

import com.Odoo.pages.BasePage;
import com.Odoo.pages.CalendarPage;
import com.Odoo.pages.LoginPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class CalendarStepDefinition {
    LoginPage loginPage = new LoginPage();
    CalendarPage calendarPage = new CalendarPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.get();

    @Then("user switches into Calendar module")
    public void user_switches_into_Calendar_module() {
        loginPage.waitUntilLoaderDisappear();
        js.executeScript("arguments[0].click();", calendarPage.calendar);
    }

    @Then("user verifies that calendar view by default is {string}")
    public void user_verifies_that_calendar_view_by_default_is(String string) {
        calendarPage.waitUntilLoaderDisappear();
        BrowserUtils.waitForPageToLoad(15);
        BrowserUtils.waitForVisibility(calendarPage.weekButton, 10);
        Assert.assertTrue(calendarPage.weekButton.getAttribute("class").endsWith("default active"));
        Assert.assertEquals(string, calendarPage.weekButton.getText());
    }

}
