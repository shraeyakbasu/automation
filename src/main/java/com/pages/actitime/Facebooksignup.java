package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autoconstant;
import com.generics.actitime.Basepage;

public class Facebooksignup extends Basepage implements Autoconstant
{
	WebDriver driver;
	
	@FindBy(xpath="//a[@id='u_0_2']")
	public WebElement createnewaccountbutton;

	@FindBy(xpath="//input[@name='firstname']")
	public WebElement firstnametext;
	
	@FindBy(xpath="//input[@name='lastname']")
	public WebElement lastnametext;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	public WebElement emailtext;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	public WebElement passwordtext;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	public WebElement daydropdownlist;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	public WebElement monthdropdownlist;
	
	@FindBy(xpath="//select[@name='birthday_year']")
	public WebElement yeardropdownlist;
	
	@FindBy(xpath="(//input[@name='sex'])[2]")
	public WebElement malegenderradio;
	
	@FindBy(xpath="(//input[@name='sex'])[1]")
	public WebElement femalegenderradio;
	
	@FindBy(xpath="(//input[@name='sex'])[3]")
	public WebElement customgenderradio;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement signupbutton;
	
	public Facebooksignup(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signup() throws IOException
	{
		createnewaccountbutton.click();
		firstnametext.sendKeys(com.generics.actitime.Excellibrary.Getcellvalue(excelpath, fbexcelsheet, 1, 0));
		lastnametext.sendKeys(com.generics.actitime.Excellibrary.Getcellvalue(excelpath, fbexcelsheet, 1, 1));
		emailtext.sendKeys(com.generics.actitime.Excellibrary.Getcellvalue(excelpath, fbexcelsheet, 1, 2));
		passwordtext.sendKeys(com.generics.actitime.Excellibrary.Getcellvalue(excelpath, fbexcelsheet, 1, 3));
		selectbytext(daydropdownlist, "25");
		selectbytext(monthdropdownlist, "Nov");
		selectbytext(yeardropdownlist, "2001");
		//femalegenderradio.click();
		malegenderradio.click();
		//customgenderradio.click();
		signupbutton.click();
	}
}
