package com.pb.cucumbertest.pagemodules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Search 
{
	WebDriver driver;
		
	@FindBy(id="search_query_top")
	public WebElement searchText;
	
	@FindBy(name="submit_search")
	public WebElement searchBtn;
	
	public Search(WebDriver driver)
	{
	    PageFactory.initElements(driver, this);
	}
	
	public void searchText(String text)
	{
		searchText.sendKeys(text);
		searchBtn.click();
	}
	

}
