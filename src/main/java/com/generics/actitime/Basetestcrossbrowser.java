package com.generics.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetestcrossbrowser implements Autoconstant

{
	public WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void openbrowser(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) 
		{
			//WebDriverManager.edgedriver().setup();
			//driver=new EdgeDriver();
			System.setProperty("webdriver.edge.driver","E:/edgedriver_win64/msedgedriver.exe");
			 driver=new EdgeDriver();
		}
		else 
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(fburl);
		
		
			
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}

}
