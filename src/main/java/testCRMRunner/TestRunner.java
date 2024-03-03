package testCRMRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
	@CucumberOptions(features= "C:\\Users\\Ashok\\eclipse\\workspace\\CucumberCRMProFramework\\src\\main\\java\\features\\login.feature",
	glue = "StepDefinitions" ,plugin = {
            "pretty",
            "html:target/cucumber-reports/cucumber-pretty",
            "json:target/cucumber/cucumber.json"} ,
    monochrome = true,
	dryRun = false
	)
	

public class TestRunner {
}
