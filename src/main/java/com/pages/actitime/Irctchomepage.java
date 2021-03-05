package com.pages.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Irctchomepage
{
    public WebDriver driver;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	public WebElement alertmsg;
	
	@FindBy(xpath="//a[.=' LOGIN ']")
	public WebElement loginbutton;
	
	@FindBy(xpath="//a[.=' REGISTER ']")
	public WebElement registerlink;
	
	@FindBy(xpath="//a[.=' CONTACT US ']")
	public WebElement contactuslink;
	
	@FindBy(xpath="//a[.=' ASK DISHA ']")
	public WebElement askdishalink;
	
	@FindBy(xpath="//strong[.='ALERTS']")
	public WebElement alertlink;
	
	public Irctchomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void alertmsgclick()
	{
		alertmsg.click();
	}
	
	public void loginbuttonclick()
	{
		loginbutton.click();
	}
	
	


}
