package com.pages.actitime;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autoconstant;
import com.generics.actitime.Excellibrary;

public class ActitimeCreateNewLeaveTypePage implements Autoconstant
{

	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Leave Type Name']")
	private WebElement leavetypenametext;
	
	@FindBy(xpath="(//div[@class='arrowDiv'])[6]")
	private WebElement icondropdown;
	
	@FindBy(xpath="//input[@id='leaveTypeLightBox_rateCoefficient']")
	private WebElement leavehourratetext;
	
	@FindBy(xpath="//input[@id='processLeaveTimeCheckbox_createPopup']")
	private WebElement processleavetimecheckbox;
	
	@FindBy(xpath="//input[@id='asPtoRadioButton_createPopup']")
	private WebElement ptoradiobutton;
	
	@FindBy(xpath="//input[@id='asSickDaysRadioButton_createPopup']")
	private WebElement sickdaysradiobutton;
	
	@FindBy(xpath="(//span[.='Create Leave Type'])[2]")
	private WebElement createleavetypebutton;
	
	@FindBy(xpath="(//div[.='Cancel'])[2]")
	private WebElement cancelbutton;
	
	public ActitimeCreateNewLeaveTypePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void leavetypemethod() throws IOException
	{
		leavetypenametext.sendKeys(Excellibrary.Getcellvalue(excelpath, actiurlsheet, 1, 4));
	}
	
	public void createleavemethod()
	{
		createleavetypebutton.click();
	}
	
	public void cancelmethod() throws InterruptedException
	{
		cancelbutton.click();
		Alert alt=driver.switchTo().alert();
		Thread.sleep(3000);
		//alt.accept();
		alt.dismiss();
		
	}
	
	public void processleavemethod()
	{
		processleavetimecheckbox.click();
		ptoradiobutton.click();
		sickdaysradiobutton.click();
	}
}
