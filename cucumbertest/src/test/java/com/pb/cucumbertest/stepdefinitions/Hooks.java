package com.pb.cucumbertest.stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.pb.cucumbertest.helper.Base;
import com.pb.cucumbertest.helper.GenericFunctions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Base
{
	Base tb = new Base();
	public ExtentSparkReporter htmlReporter;
	public   ExtentReports extent;
	Scenario scenario;
	public ExtentTest logger;


	@Before()
	public void bf0(Scenario scenario) throws InterruptedException, IOException
	{	
		setDriver();
		this.scenario = scenario;
		if ((new File(screenshotdir)).exists())
			FileUtils.cleanDirectory(new File(screenshotdir));
	}

	
	@After
	public void af0(Scenario scenario) throws InterruptedException, IOException, IllegalMonitorStateException
	{	
	    ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericFunctions.getBase64Screenshot());
	    scenario.log("Screenshot attached");
	    driver.quit();	
	}
	
}
