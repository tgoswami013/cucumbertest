package com.pb.cucumbertest.helper;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.pb.cucumbertest.util.ExtentUtil;


public class Base extends TestWatcher
{
	public static WebDriver driver;
	
	
	public void setDriver()
	{
		System.setProperty("webdriver.chrome.driver", Constants.MAC_CHROME_DRIVER);  
        driver = new ChromeDriver();  
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
       
	}
	


}
