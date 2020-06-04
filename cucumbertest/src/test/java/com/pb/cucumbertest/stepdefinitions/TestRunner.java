package com.pb.cucumbertest.stepdefinitions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = {"pretty","junit:target/cucumber/cucumber.xml","json:target/cucumber/cucumber.json","html:target/cucumber"},
		features = {"features"},
		glue={"com.pb.cucumbertest.stepdefinitions"},
		monochrome = true,
		strict = false,
		dryRun = false,
		tags = {"@SmokeTesting"}
		)

public class TestRunner{
	

	@BeforeClass
	public static void bf()
	{
		System.out.println("***Before Class***");
	}
	
	

	@AfterClass
	public static void af()
	{
		System.out.println("***After Class***");
//		StepDefinitions sd = new StepDefinitions();
//		sd.flush();
//		
	}
	
	
}


