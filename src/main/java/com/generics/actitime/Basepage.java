package com.generics.actitime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Basepage 
{
public WebDriver driver;
	
	public void selectbyvalue(WebElement element,String value)
	{
		Select sc = new Select(element);
		sc.selectByValue(value);
	}
	
	public void selectbyindex(WebElement element,int index)
	{
		Select sc = new Select(element);
		sc.selectByIndex(index);
	}
	
	public void selectbytext(WebElement element,String text)
	{
		Select sc = new Select(element);
		sc.selectByVisibleText(text);
	}
	
	public void alert()
	{
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		//alt.dismiss();
	}
	
	


}
