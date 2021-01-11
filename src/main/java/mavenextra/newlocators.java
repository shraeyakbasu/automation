package mavenextra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newlocators 
{

	@Test
	public void newlocators()
	{
		System.setProperty("webdriver.chrome.logfile", "./log/mavenlog.txt");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(new ByAll(By.id("email"),By.className("inputtext _55r1 _6luy"),By.xpath("//input[@placeholder='Email address or phone number']")));
		username.sendKeys("shraeyak1993@gmail.com");
		WebElement password=driver.findElement(new ByIdOrName("pass"));
		password.sendKeys("abcdef");
		WebElement loginbutton=driver.findElement(new ByIdOrName("login"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loginbutton);
		
		
		
		
	}
}
