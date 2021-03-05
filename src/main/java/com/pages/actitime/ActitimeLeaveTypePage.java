package com.pages.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Basepage;

public class ActitimeLeaveTypePage extends Basepage
{

	public WebDriver driver;
	
	@FindBy(xpath="//span[.='Create Leave Type']")
	private WebElement createleavetypebutton;
	
	@FindBy(xpath="//span[.='maternityleave']/../../../../../..//span[@class='leaveTypeStatusSpan leaveTypeInfoText']")
	private WebElement maternityleavestatuslink;
	
	@FindBy(xpath="//span[.='Time Off']/../../../../../..//span[@class='leaveTypeStatusSpan leaveTypeInfoText']")
	private WebElement timeoffstatuslink;
	
	@FindBy(xpath="//span[.='Vacation']/../../../../../..//span[@class='leaveTypeStatusSpan leaveTypeInfoText']")
	private WebElement vacationlink;
	
	@FindBy(xpath="//span[.='maternityleave']/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement maternityleavedeletelink;
	
	
	public ActitimeLeaveTypePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createleavetypemethod()
	{
		createleavetypebutton.click();
	}
	
	public void maternityleavemethod()
	{
		maternityleavestatuslink.click();
	}
	
	public void vacationmethod()
	{
		vacationlink.click();
	}
	
	public void timeoffmethod()
	{
		timeoffstatuslink.click();
	}
	
	public void maternitydeletemethod()
	{
		maternityleavedeletelink.click();
		alert(driver);;
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
		//alt.dismiss();
	}
}
