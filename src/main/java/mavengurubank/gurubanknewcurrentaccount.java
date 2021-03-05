package mavengurubank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gurubanknewcurrentaccount 
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
	public void createaccount() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("73029");
		driver.findElement(By.xpath("//select[@name='selaccount']")).click();
		WebElement element=driver.findElement(By.xpath("//select[@name='selaccount']"));
		Select sel=new Select(element);
		//sel.selectByVisibleText("Savings");
		sel.selectByVisibleText("Current");
		driver.findElement(By.xpath("//input[@name='inideposit']")).sendKeys("3000");
		driver.findElement(By.xpath("//input[@name='button2']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		//Thread.sleep(5000);
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
		
	}
	
	@Test (dependsOnMethods = {"login"})
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
