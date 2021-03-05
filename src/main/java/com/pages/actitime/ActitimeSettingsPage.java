package com.pages.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeSettingsPage 
{
	@FindBy(xpath="//div[.='Turn Features On / Off']")
	private WebElement turnfeatureonofflink;
	
	@FindBy(xpath="(//div[@class='item_title'])[3]")
	private WebElement generalsettingslink;
	
	@FindBy(xpath="//a[.='Workflow Settings']")
	private WebElement workflowsettingslink;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesofworklink;
	
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leavetypeslink;
	
	@FindBy(xpath="//a[.='Notifications']")
	private WebElement notificationslink;
	
	@FindBy(xpath="//a[.='Logo Settings']")
	private WebElement logosettingslink;
	
	@FindBy(xpath="//div[.='Licenses']")
	private WebElement liscenseslink;
	
	public ActitimeSettingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void turnfeatureoffmethod()
	{
		turnfeatureonofflink.click();
	}
	
	public void generalsettingsmethod()
	{
		generalsettingslink.click();
	}
	
	public void typesofworkmethod()
	{
		typesofworklink.click();
	}
	
	public void leavetypesmethod()
	{
		leavetypeslink.click();
	}
	
	public void notificationmethod()
	{
		notificationslink.click();
	}
	
	public void workflowsettingsmethod()
	{
		workflowsettingslink.click();
	}
	
	public void logosettingsmethod()
	{
		logosettingslink.click();
	}
	
	public void liscensemethod()
	{
		liscenseslink.click();
	}
}


