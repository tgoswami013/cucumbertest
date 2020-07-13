package com.pb.cucumbertest.stepdefinitions;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
		features = {"src/test/resources/features"},
		glue={"com.pb.cucumbertest.stepdefinitions"},
		monochrome = true,
		dryRun = false,
		tags = ("@SmokeTest"))


public class TestRunner{
	
	
}


