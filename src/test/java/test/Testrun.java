package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testrun {
	
	
	ChromeDriver driver;
	
	@BeforeTest
	public void test1()
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.justdial.com/");
		
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"header_freelisting\"]/a/div[3]")).click();
	}

}
