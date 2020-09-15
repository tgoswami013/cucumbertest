package com.pb.cucumbertest.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.pb.cucumbertest.helper.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonSD extends Base {
	@When("I follow {string} link")
	public void i_follow_link(String linkTxt) {
		driver.findElement(By.linkText(linkTxt)).click();
	}

	@Then("I click on {string}")
	public void i_click_sign_in_button(String locator) {
		WebElement myButton = driver.findElement(By.cssSelector(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", myButton);
	}

	@Then("I should see heading {string}")
	public void i_should_see(String text) {
		String heading = "//h1[text()='" + text + "']";
		Assert.assertTrue(driver.findElement(By.xpath(heading)).isDisplayed());
	}

	@Then("^I( see| do not see) link \"([^\"]*)\"$")
	public void i_should_see_link(String optionalValue, String linkText) {
		Boolean expectedValue;

		if (optionalValue.equals(" do not see"))
			expectedValue = false;
		else if (optionalValue.equals(" see"))
			expectedValue = true;
	}
	
	@When("I click on submit button")
	public void i_click_on_submit_button() {
//	   int a = 10 / 0;
	}

}
