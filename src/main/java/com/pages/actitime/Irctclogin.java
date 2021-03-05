package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Excellibrary;

public class Irctclogin extends Excellibrary
{
WebDriver driver;
	
	@FindBy(xpath="//input[@name='userId']")
	public WebElement useridtext;
	
	@FindBy(xpath="//input[@name='pwd']")
	public WebElement passwordtext;
	
	@FindBy(xpath="(//button[@class='search_btn train_Search'])[2]")
	public WebElement signupbutton;
	
	@FindBy(xpath="//label[.='REGISTER']")
	public WebElement registerbutton;
	
	@FindBy(xpath="//label[.='AGENT LOGIN']")
	public WebElement agentloginbutton;
	
	@FindBy(xpath="//a[@class='fa fa-window-close pull-right loginCloseBtn ng-tns-c45-13']")
	public WebElement cancellink;
	
	public Irctclogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void login() throws IOException
	{
		useridtext.sendKeys(Excellibrary.Getcellvalue(excelpath, irctcexcelsheet, 1, 0));
		passwordtext.sendKeys(Excellibrary.Getcellvalue(excelpath, irctcexcelsheet, 1, 1));
		signupbutton.click();
		cancellink.click();
	}
	



}
