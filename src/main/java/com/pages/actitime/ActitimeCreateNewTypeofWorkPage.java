package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.generics.actitime.Autoconstant;
import com.generics.actitime.Basepage;
import com.generics.actitime.Excellibrary;

public class ActitimeCreateNewTypeofWorkPage extends Basepage implements Autoconstant
{

	WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement nametext;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement statusdropdown;
	
	@FindBy(id="billingType_setBillable")
	private WebElement categorybillableradio;
	
	@FindBy(id="billingType_setNonBillable")
	private WebElement categorynonbillableradio;
	
	@FindBy(id="billingRate_input")
	private WebElement billingratetext;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement createtypeofworkbutton;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement cancelbutton;
	
	public ActitimeCreateNewTypeofWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void nametextmethod() throws IOException
	{
		nametext.sendKeys(Excellibrary.Getcellvalue(excelpath, actiurlsheet, 1, 3));
	}
	
	public void createtypeofworkmethod() throws InterruptedException
	{
		//Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@type='submit']")));
		createtypeofworkbutton.click();
		//WebElement button=createtypeofworkbutton;
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("argument[0].click()",this.createtypeofworkbutton);
	}
	
	public void cancelmethod() throws InterruptedException
	{
		Thread.sleep(3000);
		cancelbutton.click();
		alert(driver);
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
		//alt.dismiss();
		
	}
}
