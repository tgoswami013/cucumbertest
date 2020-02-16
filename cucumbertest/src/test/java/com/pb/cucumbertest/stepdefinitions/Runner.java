package com.pb.
cucumbertest.stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber"},
		features = {"features"},
		glue={"com.pb.cucumbertest.stepdefinitions"},
		monochrome = true,
		strict = true,
		
		
		
		dryRun = false,
		tags = {"@classobjects"}
		)

public class Runner {

}
