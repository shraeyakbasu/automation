package mavenextra;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Mavenvalidation
{

	public void validation()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("shraeyak1993@gmail.com");
		driver.findElement( By.xpath("//button[@name='login']")).click();
		WebElement password= driver.findElement(By.xpath("//div[@class='_9ay7']"));
		String actualerrormsg=password.getText();
		String expectederrormsg="incorrect password";
		Assert.assertEquals(actualerrormsg, expectederrormsg);
		
	}
}
