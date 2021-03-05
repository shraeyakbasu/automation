package com.pages.actitime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeQspidersSettingsPage
{

	WebDriver driver;
	@FindBy(xpath="(//div[@class='action'])[1]")
	private WebElement actionsbutton;
	
	@FindBy(xpath="(//div[.='Delete'])[2]")
	private WebElement deletelink;
	
	@FindBy(xpath="(//div[.='Copy'])[2]")
	private WebElement copylink;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement deletepermanentlybutton;
	
	@FindBy(xpath="(//div[.='Cancel'])[2]")
	private WebElement cancelbutton;
	
	public ActitimeQspidersSettingsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void actionsbuttonclickmethod() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", actionsbutton);
		//actionsbutton.click();
	}
	
	public void deletebuttonclickmethod()
	{
		deletelink.click();
		deletepermanentlybutton.click();
		//cancelbutton.click();
	}
	
	public void copybuttonclickmethod()
	{
		copylink.click();
	}
	
	
}
