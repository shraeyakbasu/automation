package com.pages.actitime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeQspidersPage 
{

	WebDriver driver;
	@FindBy(xpath="(//div[@class='editButton'])[18]")
	private WebElement settingslink;
	
	public ActitimeQspidersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void settingsmethod()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",settingslink );
	}
}



	

