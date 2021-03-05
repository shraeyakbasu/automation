package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autoconstant;
import com.generics.actitime.Excellibrary;

public class ActitimeTaskPage implements Autoconstant
{
	WebDriver driver;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbutton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerlink;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement createnewprojectlink;
	
	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement createnewtasklink;
	
	@FindBy(xpath="//div[@class='item importTasks']")
	private WebElement importtasklink;
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement starttypingnametextbox;
	
	@FindBy(xpath="(//div[.='All Customers'])[1]")
	private WebElement allcustomerslink;
	
	@FindBy(xpath="(//div[.='Big Bang Company'])[1]")
	private WebElement bigbangcompanylink;
	
	@FindBy(xpath="(//div[.='Galaxy Corporation'])[1]")
	private WebElement galaxycorporationlink;
	
	@FindBy(xpath="(//div[.='Joda Consulting Inc'])[1]")
	private WebElement jodaconsultancylink;
	
	@FindBy(xpath="(//div[.='Our company'])[1]")
	private WebElement ourcompanylink;
	
	@FindBy(xpath="(//div[.='suchi'])[1]")
	private WebElement suchilink;
	
	@FindBy(xpath="//div[.='jspiders']")
	private WebElement jspiderslink;
	
	@FindBy(xpath="(//span[.='qspiders'])[1]")
	private WebElement qspiderslink;

	public ActitimeTaskPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);;
	}
	
	public void addnewbuttonmethod()
	{
		addnewbutton.click();
		newcustomerlink.click();
		//createnewprojectlink.click();
		//createnewtasklink.click();
		//importtasklink.click();
		
	}
	
	public void bigbangmethod()
	{
		bigbangcompanylink.click();
	}
	
	public void galaxycorporationmethod()
	{
		galaxycorporationlink.click();
	}
	
	public void jodaconsultancymethod()
	{
		jodaconsultancylink.click();
	}
	
	//public void jspidersmethod()
	//{
		//jspiderslink.click();
	//}
	
	public void qspidersmethod() throws InterruptedException
	{
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("argument[0].click()",qspiderslink );
		Thread.sleep(3000);
		qspiderslink.click();
	}
	
	public void starttypingnamemethod() throws IOException
	{
		starttypingnametextbox.sendKeys(Excellibrary.Getcellvalue(excelpath, actiurlsheet, 1, 2));
		starttypingnametextbox.sendKeys(Keys.ENTER);
	}
	

	
	
}


