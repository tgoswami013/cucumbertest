package com.pb.cucumbertest.helper;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;




public class Base
{
	DesiredCapabilities cap;
	String browser = "chrome";
	public static String hubAddress = "http://192.168.1.74:8899/wd/hub";
	
	public WebDriver setDriver(WebDriver driver) throws InterruptedException, MalformedURLException
	{
		if(browser=="chrome")
		{
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
		}
		else if(browser=="firefox")
		{
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");     	
		}
	
		driver = new RemoteWebDriver(new URL(hubAddress), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
}
