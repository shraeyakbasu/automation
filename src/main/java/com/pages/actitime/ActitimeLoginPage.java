package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Excellibrary;

public class ActitimeLoginPage extends Excellibrary

{
	WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement usernametextfield;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passwordtextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloggedinckeckbox;
	
	@FindBy(xpath="(//div[contains(text(),'Login ')])[1]")
	private WebElement loginbutton;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	private WebElement forgotyourpasswordlink;
	
	@FindBy(xpath="//a[contains(text(),'actiTIME Inc.')]")
	private WebElement actitimeinclink;
	
	
	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void loginmethod() throws IOException
	{
		usernametextfield.sendKeys(Excellibrary.Getcellvalue(excelpath, actiurlsheet, 1, 0));
		passwordtextfield.sendKeys(Excellibrary.Getcellvalue(excelpath, actiurlsheet, 1, 1));
		loginbutton.click();
	}

	public void forgotpasswordmethod()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", forgotyourpasswordlink);
		
	}
	
	public void actitimeincmethod()
	{
		actitimeinclink.click();

	}
	
	public void keepmeloginmethod()
	{
		keepmeloggedinckeckbox.click();
	}
}

