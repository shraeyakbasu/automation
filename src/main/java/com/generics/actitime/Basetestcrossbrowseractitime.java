package com.generics.actitime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetestcrossbrowseractitime implements Autoconstant
{
    
	public WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void openbrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		}
		
		else if (browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","E:/edgedriver_win64/msedgedriver.exe");
			 driver=new EdgeDriver();
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(actiurl);
		
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		ActitimeLoginPage actlp=new ActitimeLoginPage(driver);
		actlp.loginmethod();
	}
	
	@AfterClass
	public  void logout()
	{
		ActitimeHomePage acthp=new ActitimeHomePage(driver);
		acthp.logoutmethod();
	
	}
	
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
	
}
