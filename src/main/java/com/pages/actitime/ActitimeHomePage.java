package com.pages.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage 
{

	WebDriver driver;
	
	@FindBy(xpath="(//div[contains(text(),'Switch to actiPLANS')])[1]")
	private WebElement switchtoactiplanlink;
	
	@FindBy(xpath="//div[@id='container_tt']")
	private WebElement timetracklink;
	
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement tasklink;
	
	@FindBy(xpath="//div[@id='container_reports']")
	private WebElement reportslink;
	
	@FindBy(xpath="//div[@id='container_users']")
	private WebElement userslink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[1]")
	private WebElement calendarslink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingslink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[3]")
	private WebElement integrationslink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[4]")
	private WebElement helpandsupportlink;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutlink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void switchtoactiplanmethod()
	{
		switchtoactiplanlink.click();
	}
	
	public void timetrackmethod()
	{
		timetracklink.click();
	}
	
	public void taskmethod()
	{
		tasklink.click();
	}
	
	public void reportmethod()
	{
		reportslink.click();
	}
	
	public void usermethod()
	{
		userslink.click();
	}
	
	public void calendarmethod()
	{
		calendarslink.click();
	}
	
	public void settingsmethod()
	{
		settingslink.click();
	}
	
	public void integrationmethod()
	{
		integrationslink.click();
	}
	
	public void helpandsupportmethod()
	{
		helpandsupportlink.click();
	}
	
	public void logoutmethod()
	{
		logoutlink.click();
	}
}
