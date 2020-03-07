package com.pb.cucumbertest.stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = {"pretty","junit:target/cucumber/cucumber.xml","json:target/cucumber/cucumber.json","html:target/cucumber"},
		features = {"features"},
		glue={"com.pb.cucumbertest.stepdefinitions"},
		monochrome = true,
		strict = true,
		dryRun = false,
		tags = {"@RegressionTest"}
		)

public class TestRunner {

}
