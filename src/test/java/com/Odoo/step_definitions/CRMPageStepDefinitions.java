package com.Odoo.step_definitions;

import com.Odoo.pages.CRMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CRMPageStepDefinitions
{
    CRMPage crmPage=new CRMPage();

    int count=0;
    @Given("user navigates to CRM page")
    public void user_navigates_to_page() {

        crmPage.navigateToCRMPage();

    }


    @And("user is on the crm page")
    public void userIsOnTheCrmPage()
    {
        String pageTitle=crmPage.header.getText();
        Assert.assertEquals("Pipeline",pageTitle);
    }

    String str="hedele";

    @Then("create new Pipeline")
    public void create_new_Pipeline() {
       crmPage.createNewPipeline(str);
        System.out.println("Creating new pipeline");
    }

    @Then("user verifies that new pipeline is created")
    public void user_verifies_that_new_pipeline_is_created() {
        System.out.println("New Pipeline Created");
    }
}
