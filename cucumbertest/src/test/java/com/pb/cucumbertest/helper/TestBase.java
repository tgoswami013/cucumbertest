package com.pb.cucumbertest.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase 
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
