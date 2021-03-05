package mavengurubank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gurubankdeletecustomer 
{
	WebDriver driver;
	@Test
	public void login() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
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
	public void newcustomer() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("shraeyak");
		driver.findElement(By.xpath("(//input[@name='rad1'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("27-12-1993");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("18a moore avenue po ps regentprk");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("kolkata");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("west bengal");
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("700040");
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("7980878745");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("shraeyak1992@yahoo.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Passwordgurubank@");
		driver.findElement(By.xpath("//input[@name='sub']")).click();
		Thread.sleep(5000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		//driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		
		
	}
	
	@Test (dependsOnMethods = {"login","newcustomer"})
	public void deletecustomer() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[contains(text(),'Delete Customer')])[2]")).click();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("27805");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		alt.accept();
		//alt.dismiss();
	}
	
	@Test (dependsOnMethods = {"login","newcustomer"})
	public void quit() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		Thread.sleep(5000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		driver.quit();
	}


}
