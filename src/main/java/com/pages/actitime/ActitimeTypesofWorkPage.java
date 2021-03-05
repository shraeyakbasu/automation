package com.pages.actitime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Basepage;

public class ActitimeTypesofWorkPage extends Basepage
{
  
	WebDriver driver;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createtypeofworkbutton;
	
	@FindBy(xpath="//input[@value='Show Types of Work']")
	private WebElement showtypesofworkbutton;
	
	@FindBy(xpath="//input[@id='filterStatusCriterion_All']")
	private WebElement allactiveandarchivedradio;
	
	@FindBy(xpath="//input[@id='filterStatusCriterion_Active']")
	private WebElement activeonlyradio;
	
	@FindBy(xpath="//input[@id='filterStatusCriterion_Archived']")
	private WebElement archivedonlyradio;
	
	@FindBy(xpath="//input[@id='filterBillableCriterion_All']")
	private WebElement allbillableandnonbillableradio;
	
	@FindBy(xpath="//input[@id='filterBillableCriterion_Billable']")
	private WebElement billableonlyradio;
	
	@FindBy(xpath="//input[@id='filterBillableCriterion_NonBillable']")
	private WebElement nonbillableonlyradio;
	
	@FindBy(xpath="//a[.='abcde']/../..//a[contains(text(),'delete')]")
	private WebElement deleteabcdeworklink;
	
	@FindBy(xpath="//a[.='engineering']")
	private WebElement typeofworkengineeringlink;
	
	@FindBy(xpath="//a[.='manufacturing']")
	private WebElement typeofworkmanufacturinglink;
	
	
	public ActitimeTypesofWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createtypeofworkmethod()
	{
		createtypeofworkbutton.click();
	}
	
	public void deleteabcdeworkmethod() throws InterruptedException
	{
		deleteabcdeworklink.click();
		//alert();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		//alt.dismiss();
		
	}
	
	public void typeofworkengineeringmethod()
	{
		typeofworkengineeringlink.click();
	}
	
	public void typeofworkmanufacturingmethod()
	{
		typeofworkmanufacturinglink.click();
	}
	
}
