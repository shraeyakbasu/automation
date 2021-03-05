package mavenextra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readpropertyfile 
{

	@Test
	public void propertyread() throws IOException
	{
		WebDriver driver;
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("./property/propertyfile.txt");
		prop.load(fis);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("useridxpath"))).sendKeys(prop.getProperty("userid"));;
		driver.findElement(By.xpath(prop.getProperty("passwordxpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("login"))).click();
		driver.quit();
		
	}
}
