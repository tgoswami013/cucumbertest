package com.pb.cucumbertest.stepdefinitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pb.cucumbertest.helper.TestBase;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTableType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinitions extends TestBase implements TypeRegistryConfigurer 

{	
	@Before
	public void bf0()
	{
		TestBase tb = new TestBase();
		tb.setDriver();
	}
	
	@When("I Logged in with users using class objects")
	public void i_Logged_in_with_users_using_class_objects(DataTable table) 
	{
		List<List<String>> myList = table.asLists();
		List<Credentials> list = new ArrayList<>();
		
		  for (List element : myList)
		    {
//			  list.add(projection.apply(element));
		    }
		
		for (Credentials item: list) {
		     System.out.println(item.getUsername());
		     System.out.println(item.getPassword());

		 }
	

	
		
//		for(Credentials c:mycred)
//		{
//			System.out.println(c.getUsername());
//			System.out.println(c.getPassword());
//
//		}
	
		
		
		
	
	}
	

	@When("I Logged in with users")
	public void i_Logged_in_with_users(DataTable dataTable) 
	{
		for (Map<String, String> data : dataTable.asMaps()) 
		{
			WebElement userName = driver.findElement(By.cssSelector("input[id='email']"));
			WebElement password = driver.findElement(By.cssSelector("input[id='passwd']"));
			userName.clear();
			userName.sendKeys(data.get("UserName")); 
			password.clear();
			password.sendKeys(data.get("Password"));
			driver.findElement(By.cssSelector("button[id='SubmitLogin']")).click();
			try
			{
				if(driver.findElement(By.xpath("//h1[text()='My account']")).isDisplayed())
				{
					System.out.println(data.get("UserName")+" is valid User");
				}
			}
			catch(Exception e)
			{
				System.out.println(data.get("UserName")+" is invalid User");
			}
			driver.manage().deleteAllCookies();
			driver.navigate().refresh();
		}	
	}
	
	@Then("I gets following response")
	public void i_gets_following_response(DataTable dataTable) 
	{
		List<List<String>> actualList= new ArrayList<List<String>>();
		actualList.add(Arrays.asList("Username", "Email"));
		actualList.add(Arrays.asList("tgoswami", "goswami.tarun77@gmail.com"));
		actualList.add(Arrays.asList("mahuja", "manish.ahuja@gmail.com"));  
		actualList.add(Arrays.asList("ssharma", "simran.sharma@gmail.com"));  

		DataTable actual = DataTable.create(actualList);
		dataTable.diff(actual);
	}
	
	
	@When("I enter following details")
	public void i_enter_following_details(DataTable dt) 
	{
		List<List<String>> data = dt.asLists();
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
		System.out.println(data.get(1).get(0));
		System.out.println(data.get(1).get(1));
		System.out.println(data.get(2).get(0));
		System.out.println(data.get(2).get(1));
		System.out.println(data.get(3).get(0));
		System.out.println(data.get(3).get(1));
		
		if(data.get(0).get(1).equals("Mr."))
			driver.findElement(By.cssSelector("input[id='id_gender1']")).click();
		else
			driver.findElement(By.cssSelector("input[id='id_gender2']")).click();	
			
		driver.findElement(By.cssSelector("input[id='customer_firstname']")).sendKeys(data.get(1).get(1));
		driver.findElement(By.cssSelector("input[id='customer_lastname']")).sendKeys(data.get(2).get(1));
		driver.findElement(By.cssSelector("input[id='passwd']")).sendKeys(data.get(3).get(1));
	}
	

	@When("^I fill in \"([^\"]*)\" with:$")
	public void i_fill_in_with1(String locator, String docString) {
	driver.findElement(By.cssSelector(locator)).sendKeys(docString);

}

	@Given("^(?:I am|User is) on the home page$")
	public void i_am_on_the_homepage()
	{
		driver.get("http://automationpractice.com");
	}
	
	@When("I follow {string} link")
	public void i_follow_link(String linkTxt) 
	{
		driver.findElement(By.linkText(linkTxt)).click();
	}
	
	@When("I fill in {string} with {string}")
	public void i_fill_in_with(String locator, String text) 
	{
		driver.findElement(By.cssSelector(locator)).sendKeys(text);
	}
	
	@Then("I click on {string}")
	public void i_click_sign_in_button(String locator) 
	{
		driver.findElement(By.cssSelector(locator)).click();
	}
	
	@Then("I should see heading {string}")
	public void i_should_see(String text) 
	{
		String heading = "//h1[text()='"+text+"']";
		Assert.assertTrue(driver.findElement(By.xpath(heading)).isDisplayed());
	}
	
	@After
	public void af0() throws InterruptedException
	{
		Thread.sleep(5000);
		//driver.quit();
	}



	
	@Then("^I( see| do not see) link \"([^\"]*)\"$")
	public void i_should_see_link(String optionalValue, String linkText) 
	{		
	  Boolean expectedValue;
//	  Boolean linkPresent = driver.findElements(By.linkText(linkText)).size() > 0;
	  
	  if(optionalValue.equals(" do not see"))
	    expectedValue = false;
	  else if(optionalValue.equals(" see"))
	    expectedValue = true;
		
//	  Assert.assertEquals(linkPresent,expectedValue);
	}
	
	@When("I fill in email with {string}")
	public void i_fill_in_email_with(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("I fill in password with {string}")
	public void i_fill_in_password_with(String a) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("value received"+a);
	}

	@When("I click on Sign in")
	public void i_click_on_Sign_in() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	
	@When("I fill in email with {string} and password with {double}")
	public void i_fill_in_email_with_and_password_with(String string, double a) {
	
	}

	@When("I hit {string} api")
	public void i_hit_api(String string) {
	}

	public void configureTypeRegistry(TypeRegistry typeRegistry) {
		// TODO Auto-generated method stub
		
	}


}