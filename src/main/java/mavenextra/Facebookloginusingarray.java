package mavenextra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookloginusingarray 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openbrowser()
	{
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.get("https://demo.actitime.com/");
	}
	
	@DataProvider(name="Login")
	public Object[][] senddata()
	{
		Object[][] obj=new Object[4][2];
		
		obj[0][0]="abcd";
		obj[0][1]="efgh";
		
		obj[1][0]="abc";
		obj[1][1]="efg";
		
		obj[2][0]="abcde";
		obj[2][1]="efghi";
		
		obj[3][0]="shraeyak1993@gmail.com";
		obj[3][1]="xyz";
		
		return obj;
		
		}
	
	
	@Test(dataProvider="Login")
	public void login(String username,String password)
	{
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.xpath("//div[.='Login '] ")).click();
	}
	
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}

}
