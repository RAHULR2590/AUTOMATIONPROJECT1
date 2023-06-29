package testautoproject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageautoproject.Lulumall;

public class Testlulumall {
	
	WebDriver driver;
	
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://lulumall.in/");
	}
	
	@Test
	public void luluTest() throws IOException, InterruptedException,Exception
	{
		Lulumall l=new Lulumall(driver);
		l.mallselect();
		l.shopselect();
		l.cafeselect();
		l.namecafe();
		l.clickcafe();
		l.mobileselect();
		l.mobilesearch();
		l.samsungselect();
		l.getTitle();
		l.luluscreenshot();
		l.pageSource();
		l.clickhamburg();
		l.closehamburg();
		l.logosearch();
		l.clickdine();
		l.chocolateselect();
		l.faloodanation();
		l.storename();
		l.foodfast();
		l.bankselect();
		l.banksearch();
		l.bankfederal();
		l.homeback();
		l.urL();
		l.scrolldown();
		l.shopback();
		l.kidswearselect();
		l.selectuspolo();
		l.backtohome();
		l.searchclick();
		l.inputsearch();
		l.homefinish();
		l.countlink();
		
		
	}
	
	
}
	



