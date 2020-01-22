package com.Odoo.step_definitions;

import com.Odoo.pages.CRMPage;
import com.Odoo.pages.CreateSalesChannelPage;
import com.Odoo.pages.LoginPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class CreateSalesChannelStepDefinitions {
    CRMPage crmPage = new CRMPage();
    CreateSalesChannelPage createSalesChannelPage = new CreateSalesChannelPage();

    @Then("user navigates to Sales Channels")
    public void user_navigates_to_Sales_Channels() {
        createSalesChannelPage.navigateToSalesChannels();
        createSalesChannelPage.waitUntilLoaderDisappear();
        BrowserUtils.wait(4);

        System.out.println("I am on Sales Channels page");

    }

    @Then("user enters following information about sales channel")
    public void user_enters_following_information_about_sales_channel() {
        BrowserUtils.waitForVisibility(crmPage.title, 15);
        Driver.get().findElement(By.cssSelector(".o_field_char.o_field_widget.o_input.o_required_modifier[name='name']")).sendKeys("Name");

    }

    @Then("user navigates to CRM")
    public void user_navigates_to_CRM() {
        createSalesChannelPage.navigateToCRM();
        createSalesChannelPage.waitUntilLoaderDisappear();
        System.out.println("I am on CRM module page");
        BrowserUtils.wait(4);


    }
}
