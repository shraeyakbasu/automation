package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autoconstant;
import com.generics.actitime.Basepage;
import com.generics.actitime.Excellibrary;

public class ActitimeCreateNewCustomerPage extends Basepage implements Autoconstant 
{
	public WebDriver driver;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernametext;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerdescriptiontext;
	
	@FindBy(xpath="//span[.='ASSIGNED USERS (3)']")
	private WebElement assigneduserlink;
	
	@FindBy(xpath="//span[.='MANAGERS (3)']")
	private WebElement managerslink;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustomerbutton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelbutton;
	
	@FindBy(xpath="(//div[@class='closeButton'])[7]")
	private WebElement closebutton;
	
	
	public ActitimeCreateNewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void entercustomernamemethod() throws IOException
	{
		entercustomernametext.sendKeys(Excellibrary.Getcellvalue(excelpath, actiurlsheet, 1, 2));
	}
	
	public void createcustomermethod() throws InterruptedException
	{
		createcustomerbutton.click();
		Thread.sleep(3000);
		cancelbutton.click();
		alert(driver);
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
		//alt.dismiss();
	}
	
	public void cancelbuttonmethod()
	{
		cancelbutton.click();
	}
	
	public void closebuttonmethod()
	{
		closebutton.click();
	}
	
	public void cancelclosealertmethod()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
		//alt.dismiss();
	}
}
