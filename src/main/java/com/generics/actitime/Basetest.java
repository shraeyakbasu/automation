package com.generics.actitime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeLoginPage;

	
public class Basetest implements Autoconstant
	{
		public WebDriver driver;

		@BeforeClass
		public void openbrowser()
		{
			System.setProperty(chromekey,chromevalue);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(actiurl);
			
		}
		
		@BeforeMethod
		public void login() throws IOException
		{
			ActitimeLoginPage actlp=new ActitimeLoginPage(driver);
			actlp.loginmethod();
		}
		
		@AfterMethod
		public void logout()
		{
			ActitimeHomePage acthp=new ActitimeHomePage(driver);
			acthp.logoutmethod();
		}
		
		@AfterClass
		public void closebrowser()
		{
			driver.quit();
		}

		

}
