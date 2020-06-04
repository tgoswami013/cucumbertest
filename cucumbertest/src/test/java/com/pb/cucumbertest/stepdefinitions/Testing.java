package com.pb.cucumbertest.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class Testing {
	
	@When("I fill in {string} with {string}")
	public void i_fill_in_with(String locator, String text) 
	{
//		driver.findElement(By.cssSelector(locator)).sendKeys(text);
//		int a = 10 / 0;
	}

}
