package mavenextra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Entercharactersequence
{

	@Test
	public void entercharacter()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		StringBuffer sb=new StringBuffer();
		sb.append("shraeyak");
		sb.append("1993");
		sb.append("@gmail.com");
		email.sendKeys(sb);
		StringBuilder sib=new StringBuilder();
		sib.append("ab");
		sib.append("cd");
		password.sendKeys(sib);
		
		
	}
}
