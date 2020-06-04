package com.pb.cucumbertest.helper;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.pb.cucumbertest.stepdefinitions.StepDefinitions;



public class Base
{
    private static String screenshotLocatie;

	String browser = "chrome";
	 


	
	public WebDriver setDriver(WebDriver driver) throws InterruptedException, MalformedURLException
	{

		System.setProperty("webdriver.chrome.driver", Constants.MAC_CHROME_DRIVER);  

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
}
