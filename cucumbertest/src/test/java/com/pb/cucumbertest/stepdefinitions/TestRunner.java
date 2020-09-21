package com.pb.cucumbertest.stepdefinitions;

import java.io.File;

import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
//@RunWith(ExtendedCucumber.class)
//@ExtendedCucumberOptions(
//        jsonReport = "target/cucumber-reports/CucumberTestReport.json",
//        retryCount = 3,
//        detailedReport = true,
//        detailedAggregatedReport = true,
//        overviewReport = true,
//        coverageReport = true,
//        jsonUsageReport = "target/cucumber-reports/cucumber-usage.json",
//        usageReport = true,
//        toPDF = true,
//        excludeCoverageTags = {"@flaky" },
//        includeCoverageTags = {"@SmokeTest" },
//        outputFolder = "target/cucumber-reports/extended-report")


@CucumberOptions(
//		Enable below plugin for Extent Adapter
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
		
//		Enable below plugin for Allure 5 Adapter
//		plugin = { "pretty", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
		features = {"src/test/resources/features" }, 
		glue = {"com.pb.cucumbertest.stepdefinitions"}, 
		monochrome = true, 
		dryRun = false, 
		tags = ("@SmokeTest")
		)

public class TestRunner {
	
//	@BeforeSuite
//	public static void setUp() {
//		System.out.println("Executing Before Suite");
//		// TODO: Add setup code
//	}
//	@AfterSuite
//	public static void tearDown() {
//		// TODO: Add tear down code
//		System.out.println("Executing After Suite");

	}



