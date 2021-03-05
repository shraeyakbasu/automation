package mavengurubank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gurubankdeleteaccount 
{
	WebDriver driver;
	@Test
	public void login() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://www.demo.guru99.com/V4/index.php");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr310091");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vyqyjUj");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		//Thread.sleep(3000);
		
	}
	
	@Test (dependsOnMethods = "login")
	public void deleteaccount() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]")).click();
		driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys("90051");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		Thread.sleep(4000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		alt.accept();
	}
	
	@Test (dependsOnMethods = "login")
	public void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		//Thread.sleep(3000);
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
		driver.quit();
	}

}
