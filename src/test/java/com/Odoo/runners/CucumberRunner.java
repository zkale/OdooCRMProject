package com.Odoo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/* Have not provided a path since features and step_Definitions packages are absent */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "",
        glue = "",
        dryRun = false,
        tags = "",
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        }
)

public class CucumberRunner {
}
