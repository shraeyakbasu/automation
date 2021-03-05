package mavenextra;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headlessbrowser 
{
	@Test
	public void headless() throws AWTException, InterruptedException
	{
		WebDriver driver;
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();
		WebElement forgottenpassword=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Actions act=new Actions(driver);
		act.contextClick(forgottenpassword).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles.size());
		ArrayList<String> al=new ArrayList<>(windowhandles);
		driver.switchTo().window(al.get(1));
		Thread.sleep(6000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Mobile number']")).sendKeys("shraeyak1993@gmail.com");
		driver.findElement(By.id("u_0_5")).click();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}



