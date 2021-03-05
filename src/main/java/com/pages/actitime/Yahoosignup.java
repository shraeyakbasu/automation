package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autoconstant;
import com.generics.actitime.Basepage;
import com.generics.actitime.Excellibrary;

public class Yahoosignup extends Basepage implements Autoconstant
{

	 public WebDriver driver;	
		@FindBy(xpath="//input[@id='usernamereg-firstName']")
		public WebElement firstnametextfield;
		
		@FindBy(xpath="//input[@id='usernamereg-lastName']")
		public WebElement lastnametextfield;
		
		@FindBy(xpath="//input[@id='usernamereg-yid']")
		public WebElement emailtextfield;
		
		@FindBy(xpath="//input[@type='password']")
		public WebElement passwordtextfield;
		
		@FindBy(xpath="//input[@name='phone']")
		public WebElement phonetext;
		
		@FindBy(xpath="//select[@id='usernamereg-month']")
		public WebElement birthmonthdropdown;
		
		@FindBy(xpath="//input[@name='dd']")
		public WebElement daytext;
		
		@FindBy(xpath="(//input[@type='tel'])[3]")
		public WebElement yeartext;
		
		@FindBy(xpath="//input[@id='usernamereg-freeformGender']")
		public WebElement gendertext;
		
		@FindBy(xpath="//button[@id='reg-submit-button']")
		public WebElement continuebutton;
		
		
		public Yahoosignup(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}

		
		
		public void signup() throws IOException
		{
			firstnametextfield.sendKeys(Excellibrary.Getcellvalue(excelpath, excelsheet, 1, 0));
			lastnametextfield.sendKeys(Excellibrary.Getcellvalue(excelpath, excelsheet, 1, 1));
			emailtextfield.sendKeys(Excellibrary.Getcellvalue(excelpath, excelsheet, 1, 2));
			passwordtextfield.sendKeys(Excellibrary.Getcellvalue(excelpath, excelsheet, 1, 3));
			phonetext.sendKeys(Excellibrary.Getcellvalue(excelpath, excelsheet, 1, 4));
			selectbytext(birthmonthdropdown, "November");
			daytext.sendKeys(Excellibrary.Getcellvalue(excelpath, excelsheet, 1, 5));
			yeartext.sendKeys(Excellibrary.Getcellvalue(excelpath, excelsheet, 1, 6));
			gendertext.sendKeys(Excellibrary.Getcellvalue(excelpath, excelsheet, 1, 7));
			continuebutton.click();
			
		}
		

}
