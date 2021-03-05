package mavengurubank;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class gurubanklogin 
{
	public void login() throws InterruptedException
	{
		WebDriver driver;
		String expectedtitle="Guru99 Bank Manager HomePage";
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
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("passed");
		//System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		Thread.sleep(8000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		driver.quit();
	}

}
