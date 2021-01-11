package mavenextra;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavenvalidation3 
{

	WebDriver driver;
	@Test
	public void validation3()
	{
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("shraeyak1993@gmail.com");
		driver.findElement( By.xpath("//button[@name='login']")).click();
		WebElement password= driver.findElement(By.xpath("//div[@class='_9ay7']"));
		String actualerrormsg=password.getAttribute("innerHTML");
		String expectederrormsg="The password that you've entered is incorrect";
		Assert.assertTrue(actualerrormsg.contains("entered is incorrect"));
		Reporter.log("successful",true);
		
		
		
		
	}
}
