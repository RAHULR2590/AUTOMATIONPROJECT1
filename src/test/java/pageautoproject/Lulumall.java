package pageautoproject;





import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.base.Verify;

public class Lulumall {
	
	
	WebDriver driver;
	
	
	By selectmall=By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/div");
    By selectshop=By.xpath("/html/body/div/header/ul/li[1]/a");
    By selectcafe=By.xpath("/html/body/div/div[3]/div/div[2]/div/ul/li[5]/a");
    By cafename=By.xpath("/html/body/div/div[4]/div[2]/div[2]/ul/li[2]/div/a/h5");   
    By cafeclick=By.xpath("/html/body/div/div[4]/div[2]/div[2]/ul/li[1]/div/a/div/img");
    By selectmobile=By.xpath("//*[@id=\"storeCategory\"]");
    By searchmobile=By.xpath("/html/body/div/div[4]/div[2]/div[1]/div[1]/div[3]/button");
    By selectsamsung=By.xpath("/html/body/div/div[4]/div[2]/div[2]/ul/li[5]/div/a/div/img");
    By screenshotlulu=By.xpath("//*[@id=\"bannerVid\"]");
    By hamburgclick=By.xpath("/html/body/div/div[1]/span");
    By hamburgclose=By.xpath("/html/body/div/div[1]/span");
    By logo=By.xpath("/html/body/div/header/a");
    By dineclick=By.xpath("/html/body/div/header/ul/li[2]/a");
    By selectchocolate=By.xpath("/html/body/div/div[4]/div/a[2]/div/div/h1");
    By selectfaloodanation=By.xpath("/html/body/div/div[4]/div[2]/div[2]/ul/li[3]/div/a/div/img");
    By icecreamstorename=By.xpath("/html/body/div/div[4]/div[2]/div[2]/ul/li[1]/div/a/h5");
    By fastfood=By.xpath("/html/body/div/div[4]/div/a[3]/div/div/h1");
    By selectbank=By.xpath("//*[@id=\"storeCategory\"]");
    By searchbank=By.xpath("/html/body/div/div[4]/div[2]/div[1]/div[1]/div[3]/button");
    By federalbank=By.xpath("/html/body/div/div[4]/div[2]/div[2]/ul/li[2]/div/a/div/img");
    By urlget=By.xpath("/html/body/div/header/ul/li[3]/a");
    By backshop=By.xpath("/html/body/div/footer/div[2]/div/div/div[1]/ul/li[3]/a");
    By kidswear=By.xpath("/html/body/div/div[3]/div/div[2]/div/ul/li[15]/a");
    By uspoloselect=By.xpath("/html/body/div/div[4]/div[2]/div[2]/ul/li[9]/div/a/div/img");
    By search=By.xpath("//*[@id=\"searchsubmit\"]/i");
    By searchinput=By.xpath("//*[@id=\"searchInput\"]");
    By linkcount=By.xpath("/html/body/div/header/ul/li[1]/a");
    
    		
    
    public Lulumall(WebDriver driver)
    {
    	this.driver=driver;
    }
   
    public void mallselect()
    {
    	driver.findElement(selectmall).click();
    }
    public void shopselect()
    {
    	driver.findElement(selectshop).click();
    }
    public void cafeselect()
    {
    	driver.findElement(selectcafe).click();
    }
    public void namecafe()
    {
        String t= driver.findElement(cafename).getText();
    	System.out.println("cafe name.."+t);
    }
    public void clickcafe()
    {
    	driver.findElement(cafeclick).click();
    	driver.navigate().back();
     }
    public void mobileselect()
    {
    	WebElement category=driver.findElement(selectmobile);
        Select categorydetails=new Select(category);
        categorydetails.selectByValue("mobile-electronics");
       
    }
    public void mobilesearch() 
    {
    driver.findElement(searchmobile).click();
    }
    public void samsungselect()
    {
    	driver.findElement(selectsamsung).click();
    	driver.navigate().back();
    	driver.navigate().back();
    	driver.navigate().back();
    	driver.navigate().back();
    	
    }
    public void getTitle()
    {
    	String actualtitle=driver.getTitle();
    	System.out.println("actual title is " +actualtitle);
		String expected="Lulu Mall Kochi | World of Happiness";
		Assert.assertEquals(expected,actualtitle);
    }
    public void luluscreenshot() throws IOException
    {
    	WebElement screen=driver.findElement(screenshotlulu);
    	File pic=screen.getScreenshotAs(OutputType.FILE);
    	FileHandler.copy(pic, new File("./Screenshot/mall.png"));
    }
    public void pageSource()
    {
    	String pgesrc=driver.getPageSource();
    	if(pgesrc.contains("kochi"))
    	{
    		System.out.println("text 'kochi' is present");
    	}
    	else
    	{
    		System.out.println("text 'kochi' is not present");
    	}
    }
    public void clickhamburg() throws InterruptedException
    {
    	driver.findElement(hamburgclick).click();
    	Thread.sleep(3000);
    }
    public void closehamburg()
    {
    	driver.findElement(hamburgclose).click();
    }
    public void logosearch()
    {
    	boolean logoo=driver.findElement(logo).isDisplayed();
    	if(logoo)
    	{
    		System.out.println("logo is present");
    	}
    	else
    	{
    		System.out.println("logo not present");
    	}
    			
    }
    public void clickdine()
    {
    	driver.findElement(dineclick).click();
    }
    public void chocolateselect()
    {
    	driver.findElement(selectchocolate).click();
    }
    public void faloodanation()
    {
        driver.findElement(selectfaloodanation).click();
        driver.navigate().back();
    }
    public void storename()
    {
    	String s=driver.findElement(icecreamstorename).getText();
    	System.out.println("icecream store name..."+s);
    	driver.navigate().back();
    }
    public void foodfast()
    {
    	driver.findElement(fastfood).click();
    }
    public void bankselect()
    {
    	
    	driver.findElement(selectbank).sendKeys("bank");
    	
    }
    public void banksearch()
    {
    	driver.findElement(searchbank).click();
    }
    public void bankfederal()
    {
    	driver.findElement(federalbank).click();
    }
    public void homeback()
    {
    	driver.navigate().back();
    	driver.navigate().back();
    	driver.navigate().back();
    	driver.navigate().back();
    }
    public void urL()
    {
    
    	driver.findElement(urlget).click();
    	String Exp="https://lulumall.in/kochi/entertainment-directory/";
    	String Url=driver.getCurrentUrl();
    	if(Url.equals(Exp))
    	{
    		System.out.println("clicked entertain");
    	}
    	else
    	{
    		System.out.println("clickin failed");
    	}
    		
    		System.out.println(Url);
    }
    public void scrolldown()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public void shopback()
    {
    	driver.findElement(backshop).click();
    }
    public void kidswearselect()
    {
    	driver.findElement(kidswear).click();
    }
    public void selectuspolo()
    {
    	driver.findElement(uspoloselect).click();
    }
    public void backtohome() throws InterruptedException
    {
    	driver.navigate().back();
    	driver.navigate().back();
    	driver.navigate().back();
    	Thread.sleep(3000);
    }
    public void searchclick() 
    {
    	driver.findElement(search).click();
    }
    public void inputsearch()
    {
    	driver.findElement(searchinput).sendKeys("services",Keys.ENTER);
    }
    public void homefinish()
    {
    	driver.navigate().back();
    	driver.navigate().back();
    }
    public void countlink() throws Exception
    {
    	List<WebElement> links=driver.findElements(linkcount);
		System.out.println("total no of links= "+links.size());
    }	 
	
    	
 }
        
   
   
    		
    
    
   
    


